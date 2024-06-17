package exceptions;

public class BadGenderException extends Exception{
    public BadGenderException() {

    }

    public BadGenderException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
