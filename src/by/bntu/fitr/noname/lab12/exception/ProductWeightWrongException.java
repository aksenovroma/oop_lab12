package by.bntu.fitr.noname.lab12.exception;

public class ProductWeightWrongException extends WrongArgumentException {
    public ProductWeightWrongException() {
    }

    public ProductWeightWrongException(String message) {
        super(message);
    }

    public ProductWeightWrongException(String message, Throwable cause) {
        super(message, cause);
    }
}
