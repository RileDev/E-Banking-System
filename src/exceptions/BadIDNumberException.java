package exceptions;

public class BadIDNumberException extends Exception{
    public BadIDNumberException() {

    }

    public BadIDNumberException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
