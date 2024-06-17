package exceptions;

public class NotEnoughBalanceException extends Exception{

    public NotEnoughBalanceException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
