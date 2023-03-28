package ru.sber.generics;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        System.out.println("Введите количество чисел");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите " + number + " Чисел");
        for(int i = 0; i < number; i++) {
            int numbers = scanner.nextInt();
            arrayList.add(numbers);
        }
        System.out.println("Размер list " + arrayList.size());
        //firstindex, lastIndex
        System.out.println("Введите число, чтобы узнать на какой позиции будет встречено оно первый раз и последний");
        number = scanner.nextInt();
        System.out.println("Первое встреченное на позиции " + arrayList.indexOf(number) +
                " Последнее встреченное на позиции "
                + arrayList.lastIndexOf(number));
        //add
        System.out.println("Добавьте еще одно число");
        number = scanner.nextInt();
        arrayList.add(number);
        System.out.println("Размер list " + arrayList.size());
        //remove
        System.out.println("Введите элемент, который хотите удалить");
        number = scanner.nextInt();
        arrayList.remove(number);
        System.out.println("Размер list " + arrayList.size());
        //contains
        System.out.println("Введите число, чтобы проверить содержится ли оно");
        number = scanner.nextInt();
        System.out.println(arrayList.contains(number));


        //set
        System.out.println("Введите номер элемента, который хотите заменить и на какое число");
        int num = scanner.nextInt();
        number = scanner.nextInt();
        arrayList.set(num, number);
        System.out.println("Введите число, чтобы проверить содержится ли оно");
        number = scanner.nextInt();
        System.out.println(arrayList.contains(number));
        //sublist
        System.out.println("Создадим новый list на основе первого, введите позицию 'от' и 'до' ");
        num = scanner.nextInt();
        number = scanner.nextInt();
        arrayList.subList(num, number);
        System.out.println("Размер нового list " + arrayList.size());
        //clear
        arrayList.clear();
        System.out.println("List почищен, его размер " + arrayList.size());
    }
}