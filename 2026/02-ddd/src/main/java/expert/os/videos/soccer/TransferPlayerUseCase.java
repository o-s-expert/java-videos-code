package expert.os.videos.soccer;

public class TransferPlayerUseCase {

    private final TeamRepository repository;
    private final TransferService transferService;
    private final EventPublisher events;

    public TransferPlayerUseCase(
            TeamRepository repository,
            TransferService transferService,
            EventPublisher events) {

        this.repository = repository;
        this.transferService = transferService;
        this.events = events;
    }

    public void execute(
            Player player,
            Team source,
            Team destination) {

        transferService.transfer(
                player,
                source,
                destination
        );

        repository.save(source);
        repository.save(destination);

        events.publish(new NewSoccerHired(destination, player));
    }
}
