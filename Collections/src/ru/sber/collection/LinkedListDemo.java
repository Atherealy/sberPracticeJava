package ru.sber.collection;

import java.util.Scanner;

public class LinkedListDemo {
    private LinkedList linkedList;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Введите количество чисел");
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = scanner.nextInt();

        System.out.println("Введите сами числа ");
        for(int i = 0; i < amountOfNumbers; i++ ){
            int number = scanner.nextInt();
            linkedList.add(number);
        }

        int num = 0;
        boolean cheak = true;

        while(cheak) {
            switch (num) {
                case 1:
                    System.out.println("Введите число, которое хотите добавить в начало");
                    int number1 = scanner.nextInt();
                    linkedList.addFirst(number1);
                    num = 0;
                    break;
                case 2:
                    System.out.println("Введите число, которое хотите добавить в конец");
                    int number2 = scanner.nextInt();
                    linkedList.addLast(number2);
                    num = 0;
                    break;
                case 3:
                    System.out.println("Первый элемент коллекции " + linkedList.getFirst());
                    num = 0;
                    break;
                case 4:
                    System.out.println("Последний элемент коллекции " + linkedList.getLast());
                    num = 0;
                    break;
                case 5:
                    System.out.println("Удалить первый элемент");
                    linkedList.pollFirst();
                    System.out.println("" + linkedList.size());
                    num = 0;
                    break;
                case 6:
                    System.out.println("Удалить последний элемент");
                    linkedList.pollLast();
                    System.out.println("Чисел стало " + linkedList.size());
                    num = 0;
                    break;
                case 7:
                    System.out.println("Удаляем первый элемент коллекции. Возвращаем удаленный элемент.");
                    linkedList.removeFirst();
                    num = 0;
                    break;
                case 8:
                    System.out.println("Удаляем последний элемент коллекции. Возвращаем удаленный элемент.");
                    linkedList.removeLast();
                    num = 0;
                case 9:
                    System.out.println("Размер коллекции " + linkedList.size());
                    num = 0;
                    break;
                case 10:
                    System.out.println("Выход ");
                    cheak = false;
                    break;
                case 0:
                    System.out.println();
                    System.out.println("Меню: ");
                    System.out.println("1 - Введите число, которое хотите добавить в начало");
                    System.out.println("2 - Введите число, которое хотите добавить в конец");
                    System.out.println("3 - Первый элемент коллекции");
                    System.out.println("4 - Последний элемент коллекции");
                    System.out.println("5 - Удалить первый элемент");
                    System.out.println("6 - Удалить последний элемент");
                    System.out.println("7 - Удаляем первый элемент коллекции. Возвращаем удаленный элемент.");
                    System.out.println("8 - Удаляем последний элемент коллекции. Возвращаем удаленный элемент.");
                    System.out.println("9 - Размер коллекции ");
                    System.out.println("10 - Выход ");
                    System.out.println("0 - Меню ");
                    num = scanner.nextInt();
                    break;
                default:
                    break;
            }
        }
    }
}
