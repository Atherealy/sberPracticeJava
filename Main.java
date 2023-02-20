package ru.sber.oop1;

public class Main {
    private static void DemoPhone() {
        Phone phone = new Phone();
        phone.receiveCall("Андрей");
        phone.sendMessage(new String[] { "900", "89256413975", "03", "911", "0" });
        Phone sberPhone = new Phone("900", "Iphone XS");
        Phone actualPhone = new Phone("89256413975", "Samsung galaxy s20", 175);
        sberPhone.receiveCall("Реклама", "89256413975");
        System.out.println(actualPhone.getNumber());
    }

    private static void DemoCircle() {
        Circle circle = new Circle(Math.random() * 89, "Зеленый");
        System.out.format("Площадь круга: %f\n", circle.area());
        System.out.format("Периметр круга: %f\n", circle.perimeter());
        System.out.println(circle);
    }

    private static void DemoMatrix() {
        int BASE_ROW = 6;
        int BASE_COLUMN = 7;
        int ADDITION_ROW = 4;
        int ADDITION_COLUMN = 4;
        int counter = 0;
        Matrix baseMatrix = new Matrix(BASE_ROW, BASE_COLUMN);
        for (int i = 0; i < BASE_ROW; i++) {
            for (int j = 0; j < BASE_COLUMN; j++) {
                baseMatrix.setValue(i, j, counter++);
            }
        }
        baseMatrix.print();

        Matrix additionMatrix = new Matrix(ADDITION_ROW, ADDITION_COLUMN);
        for (int i = 0; i < ADDITION_ROW; i++) {
            for (int j = 0; j < ADDITION_COLUMN; j++) {
                additionMatrix.setValue(i, j, counter--);
            }
        }
        baseMatrix
                .summ(additionMatrix)
                .print();

        Matrix multiplication = new Matrix(9, 6);
        for (int i = 0; i < multiplication.rowCount; i++) {
            for (int j = 0; j < multiplication.columnCount; j++) {
                multiplication.setValue(i, j, --counter);
            }
        }
        multiplication.print();
        baseMatrix.multiplication(multiplication).print();
    }

    private static void DemoAuthorBook() {
        Author Jonathan = new Author("Джонатан Свифт", "Мужчина");
        Book Gulliver = new Book("Путешествия Гулливера", Jonathan, 1726);
        System.out.println(Jonathan);
        System.out.println(Gulliver);

        Author Streamer = new Author("Владимир Братишкин", "Мужчина", null);
        Book Twich = new Book("89 squad", Streamer, 2020);
        Twich.setYear(2020);
        System.out.println(Streamer);
        System.out.println(Twich);
    }

    private static void DemoPizzaOrder() {
        PizzaOrder pizzaOrder = new PizzaOrder("Спайси", "Ленинградкая 45", "Большая", true);
        System.out.println(pizzaOrder);

        pizzaOrder.setSauce(true);
        pizzaOrder.setSize("Большая");

        pizzaOrder.order();
        System.out.println(pizzaOrder);

        pizzaOrder.cancel();
        pizzaOrder.cancel();
        System.out.println(pizzaOrder);

        pizzaOrder.setAddress("1-мкр Гпз-23 10");
        pizzaOrder.order();
        pizzaOrder.order();
        System.out.println(pizzaOrder);
    }

    public static void main(String[] args) {
        DemoPhone();
        System.out.println();

        DemoCircle();
        System.out.println();

        DemoMatrix();
        System.out.println();

        DemoAuthorBook();
        System.out.println();

        DemoPizzaOrder();
        System.out.println();
    }
}
