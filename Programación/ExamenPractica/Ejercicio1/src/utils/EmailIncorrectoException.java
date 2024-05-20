package utils;

public class EmailIncorrectoException extends Exception{
    public EmailIncorrectoException() {
    }

    public EmailIncorrectoException(String message) {
        super(message);
    }
}
