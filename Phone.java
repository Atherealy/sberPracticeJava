package ru.sber.oop1;
public class Phone{
    private String number = "";
    private String model = "";
    private int weight = 0;

    public Phone(){}

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.format("Звонит %s\n", name);
    }

    public void receiveCall(String name, String number) {
        System.out.format("Звонит %s (%s)\n", name, number);
    }

    public void sendMessage(String[] numbers) {
        for (String number : numbers) {
            System.out.format("%s\n", number);
        }
    }

    public String getNumber() {
        return number;
    }

    public String toString() {
        return String.format("{ Номер: %s; Модель: %s; Вес: %d }", number, model, weight);
    }

}
