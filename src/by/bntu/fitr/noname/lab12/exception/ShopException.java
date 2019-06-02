package by.bntu.fitr.noname.lab12.exception;

public class ShopException extends Exception {
    public ShopException() {
    }

    public ShopException(String message) {
        super(message);
    }

    public ShopException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShopException(Throwable cause) {
        super(cause);
    }
}
