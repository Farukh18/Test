package createException;

public class LimitException extends RuntimeException {
    private final int attempt = 5;
    String message;
    public LimitException (String s){
        super(s);
    }

//    public LimitException(String message) {
//        this.message = message;
//    }

    public LimitException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public LimitException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public LimitException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public int getAttempt() {
        return attempt;
    }
}

