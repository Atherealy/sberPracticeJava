package ru.sber.exception;

public class InvalidCardNumberException extends Exception {

    public InvalidCardNumberException(String cardNumber) {
        super(String.format("Неверно введён номер карты %s : неверная длина или присутсвуют неизвестные символы",
                cardNumber));
    }


}
