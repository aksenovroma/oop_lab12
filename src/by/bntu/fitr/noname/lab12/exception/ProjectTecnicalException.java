package by.bntu.fitr.noname.lab12.exception;

public class ProjectTecnicalException extends ShopException {
    public ProjectTecnicalException() {
    }

    public ProjectTecnicalException(String message) {
        super(message);
    }

    public ProjectTecnicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectTecnicalException(Throwable cause) {
        super(cause);
    }
}
