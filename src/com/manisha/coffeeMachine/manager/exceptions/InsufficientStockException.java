package com.manisha.coffeeMachine.manager.exceptions;

public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(String s) {
        super(s);
    }

    public InsufficientStockException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
