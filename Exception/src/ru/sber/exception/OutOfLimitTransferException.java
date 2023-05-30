package ru.sber.exception;

public class OutOfLimitTransferException extends Exception {

    public OutOfLimitTransferException(String cardNumber, Double requested, Double remaining) {
        super(String.format("Карта %s не способна выполнить запрос %.2f, так как её лимит равен %.2f",
                cardNumber,
                requested,
                remaining));
    }

}