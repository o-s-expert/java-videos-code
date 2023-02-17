package expert.os.workshop.ddd.taxi;

public class OverTeamException extends RuntimeException{
    public OverTeamException(String message) {
        super(message);
    }
}
