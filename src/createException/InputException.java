package createException;

public class InputException extends Exception {
    public InputException(final String message) {
        super(message);
    }

    public InputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InputException(Throwable cause) {
        super(cause);
    }



    public InputException() {
    }
}

