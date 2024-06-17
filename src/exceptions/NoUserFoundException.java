package exceptions;

public class NoUserFoundException extends Exception{
    public NoUserFoundException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
