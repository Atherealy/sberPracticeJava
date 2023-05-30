package ru.sber.exception;

public class NullArgumentsException extends Exception {

    public NullArgumentsException(String Argument, String whatWrong) {
        super(String.format(Argument, whatWrong));
    }
}
