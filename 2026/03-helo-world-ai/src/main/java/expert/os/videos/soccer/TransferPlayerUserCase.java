package expert.os.videos.soccer;

public class TransferPlayerUserCase {

    private final TeamRepository teamRepository;
    private final TransferService transferService;
    private final EventPublisher eventPublisher;

    public TransferPlayerUserCase(TeamRepository teamRepository, TransferService transferService, EventPublisher eventPublisher) {
        this.teamRepository = teamRepository;
        this.transferService = transferService;
        this.eventPublisher = eventPublisher;
    }

    public void execute(Player player, Team source, Team destination) {
        transferService.transfer(player, source, destination);
        teamRepository.save(source);
        teamRepository.save(destination);
        eventPublisher.publish(new NewSoccerHired(destination, player));
    }
}
