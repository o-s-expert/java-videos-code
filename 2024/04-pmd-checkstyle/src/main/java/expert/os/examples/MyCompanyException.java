package expert.os.examples;

public class MyCompanyException extends RuntimeException {

    public MyCompanyException(String message) {
        super(message);
    }

    public MyCompanyException(String message, Throwable cause) {
        super(message, cause);
    }
}
