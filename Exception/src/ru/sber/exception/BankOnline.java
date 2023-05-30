package ru.sber.exception;

import java.util.Scanner;
public class BankOnline{

    public final String blockedCard = "1, 2222222222222222, 3333333333333333, 4444444444444444, 5555555555555555";

    public static void main(String[] args) throws InvalidCardNumberException, NegativeTransferAmountException, NullArgumentsException, OutOfLimitTransferException, TransferToBlockedCardException {
        BankOnline bank = new BankOnline();
        Scanner in = new Scanner(System.in);
        String cardNumber = in.nextLine();//
        Double money = in.nextDouble();//
        bank.send(cardNumber, money);
        //bank.send(null, money);
        //bank.send(cardNumber, null);
    }

    public void send(String cardNumber, Double money) throws TransferToBlockedCardException, InvalidCardNumberException, OutOfLimitTransferException, NegativeTransferAmountException, NullArgumentsException{
        if (cardNumber  == null){
            throw new NullArgumentsException("cardNumber", "Передан обьект null");
        }

        if (money  == null){
            throw new NullArgumentsException("money", "Передан обьект null");
        }

        if (!cardNumber.matches("^[0-9]{16}$")){
            throw new InvalidCardNumberException(cardNumber);
        }

        if (money >= 50_000){
            throw new OutOfLimitTransferException(cardNumber, money, 50000.0);
        }

        if (money < 0){
            throw new NegativeTransferAmountException(cardNumber, money);
        }

        if (blockedCard.contains(cardNumber)){
            throw new TransferToBlockedCardException(cardNumber);
        }
    }
}
