package com.manisha.coffeeMachine.manager.exceptions;

public class IllegalInputException extends RuntimeException {
    public IllegalInputException(String s) {
        super(s);
    }

    public IllegalInputException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
