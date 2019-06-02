package by.bntu.fitr.noname.lab12.exception;

public class ProductPriceWrongException extends WrongArgumentException {
    public ProductPriceWrongException() {
    }

    public ProductPriceWrongException(String message) {
        super(message);
    }

    public ProductPriceWrongException(String message, Throwable cause) {
        super(message, cause);
    }
}
