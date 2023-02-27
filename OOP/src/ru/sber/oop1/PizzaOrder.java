package ru.sber.oop1;

public class PizzaOrder {

    private String name;

    private String address;

    private String size;

    private boolean Sauce;

    private boolean inProgress = false;

    private boolean Cancelled = false;

    private String formatOrder() {
        return String.format("%s пицца %s%s на адрес %s", size, name, Sauce ? " с соусом" :  "", address);
    }

    public PizzaOrder(String name, String address, String size, boolean Sauce) {
        this.name = name;
        this.address = address;
        this.size = size;
        this.Sauce = Sauce;
    }

    public void order() {
        if (inProgress) {
            System.out.println("Заказ уже принят");
            return;
        }

        System.out.format("Заказ принят: %s\n", formatOrder());
        inProgress = true;
        Cancelled = false;
    }

    public void cancel() {
        if (inProgress) {
            System.out.format("Заказ отменен: %s\n", formatOrder());
            inProgress = false;
            Cancelled = true;
            return;
        }

        System.out.println("Заказ не был принят");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean Sauce() {
        return Sauce;
    }

    public void setSauce(boolean Sauce) {
        this.Sauce = Sauce;
    }

    public String toString() {
        String progress = Cancelled ? "Отменен" : "Не принят";

        if (inProgress) {
            progress = "Принят к исполнению";
        }

        return String.format("%s пицца %s%s на адрес %s. Статус заказа: %s",
                size, name, Sauce ? " с соусом" : "", address, progress);
    }

}
