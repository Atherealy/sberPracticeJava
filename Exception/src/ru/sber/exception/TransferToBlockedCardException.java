package ru.sber.exception;

public class TransferToBlockedCardException extends Exception {

    public TransferToBlockedCardException(String cardNumber) {
        super(String.format("Попытка перевода на заблокированную карту %s",
                cardNumber));
    }

}