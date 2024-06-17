package exceptions;

public class BadNameException extends Exception{
    public BadNameException() {

    }

    public BadNameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
