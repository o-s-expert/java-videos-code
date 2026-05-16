package expert.os.videos.soccer;

public class TransferService {

    public void transfer(Player player, Team source, Team destination) {
        source.remove(player);
        destination.add(player);
    }
}
