package ru.sber.collection;

import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("Введите количество чисел");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите сами числа");
        for(int i = 0; i < number; i++) {
            int numbers = scanner.nextInt();
            arrayList.add(numbers);
        }
        System.out.println("Размер list " + arrayList.size());


        System.out.println("Введите число, чтобы узнать на каких позициях оно будет встречено первый раз и последний");
        number = scanner.nextInt();
        System.out.println("Первое встреченное на позиции " + arrayList.indexOf(number) +
                ", последнее встреченное на позиции "
                + arrayList.lastIndexOf(number));


        System.out.println("Добавьте еще одно число");
        number = scanner.nextInt();
        arrayList.add(number);
        System.out.println("Размер list " + arrayList.size());


        System.out.println("Введите элемент, который хотите удалить");
        number = scanner.nextInt();
        arrayList.remove(number);
        System.out.println("Размер list " + arrayList.size());


        System.out.println("Введите число, чтобы проверить содержится ли оно");
        number = scanner.nextInt();
        System.out.println(arrayList.contains(number));


        System.out.println("Введите номер элемента, который хотите заменить и число на которое его заменить");
        int num = scanner.nextInt();
        number = scanner.nextInt();
        arrayList.set(num, number);
        System.out.println("Введите число, чтобы проверить содержится ли оно");
        number = scanner.nextInt();
        System.out.println(arrayList.contains(number));


        System.out.println("Создадим новый list на основе изначального, введите позицию 'от' и 'до' ");
        num = scanner.nextInt();
        number = scanner.nextInt();
        arrayList.subList(num, number);
        System.out.println("Размер нового list " + arrayList.size());


        arrayList.clear();
        System.out.println("List очищен, его размер " + arrayList.size());
    }
}
