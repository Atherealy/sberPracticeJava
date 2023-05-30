package ru.sber.exception;

public class NegativeTransferAmountException extends Exception{

    public NegativeTransferAmountException(String cardNumber, Double requested) {
        super(String.format("Карта %s не способна выполнить запрос %.2f, так как введена отрицательная сумма перевода",
                cardNumber,
                requested));
    }

}
