package by.bntu.fitr.noname.lab12.exception;

public class WrongArgumentException extends ProjectLogicException {
    public WrongArgumentException() {
    }

    public WrongArgumentException(String message) {
        super(message);
    }

    public WrongArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
