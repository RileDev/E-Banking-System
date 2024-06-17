package exceptions;

public class BadEmailException extends Exception{
    public BadEmailException() {

    }

    public BadEmailException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
