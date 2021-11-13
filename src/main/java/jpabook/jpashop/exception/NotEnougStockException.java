package jpabook.jpashop.exception;

public class NotEnougStockException extends RuntimeException{

    public NotEnougStockException() {
        super();
    }

    public NotEnougStockException(String message) {
        super(message);
    }

    public NotEnougStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnougStockException(Throwable cause) {
        super(cause);
    }

}
