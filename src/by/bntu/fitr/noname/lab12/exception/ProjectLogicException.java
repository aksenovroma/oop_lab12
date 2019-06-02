package by.bntu.fitr.noname.lab12.exception;

public class ProjectLogicException extends ShopException {
    public ProjectLogicException() {
    }

    public ProjectLogicException(String message) {
        super(message);
    }

    public ProjectLogicException(String message, Throwable cause) {
        super(message, cause);
    }
}
