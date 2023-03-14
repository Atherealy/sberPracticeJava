package ru.sber.collection;

import java.util.Scanner;
public class HashMapDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap hashMap = new HashMap();

        System.out.println("Введите количество чисел");
        int Numbers = scanner.nextInt();

        System.out.println("Введите сами числа");
        for(int i = 0; i < Numbers; i++){
            int number = scanner.nextInt();
            hashMap.put(i, number);
        }

        int num = 9;
        boolean bool = true;
        while(bool){
            switch(num){
                case 1:
                    System.out.println("Размеры хештаблицы " + hashMap.size());
                    num = 9;
                    break;
                case 2:
                    System.out.println("Таблица не пуста? " + hashMap.isEmpty());
                    num = 9;
                    break;
                case 3:
                    System.out.println("Введите ключ, чтобы проверить содержится ли");
                    int keyTable = scanner.nextInt();
                    System.out.println("Проверка на наличие ключа: " +hashMap.containsKey(keyTable) );
                    num = 9;
                    break;
                case 4:
                    System.out.println("Введите значение, чтобы проверить содержится ли");
                    int numTable = scanner.nextInt();
                    System.out.println("Проверка на наличие числа: " +hashMap.containsValue(numTable));
                    num = 9;
                    break;
                case 5:
                    System.out.println("Вставка пары, введите ключ и значение ");
                    int newkey = scanner.nextInt();
                    int newvalue = scanner.nextInt();
                    hashMap.put(newkey, newvalue);
                    num = 9;
                    break;
                case 6:
                    System.out.println("Введите ключ, который хотите удалить ");
                    int removekey = scanner.nextInt();
                    hashMap.remove(removekey);
                    num = 9;
                    break;
                case 7:
                    System.out.println("Получение новой коллекции, состоящей из всех значений");
                    hashMap.values();
                    num = 9;
                    break;
                case 8:
                    System.out.println("Получение новой коллекции, состоящей из всех ключей");
                    num = scanner.nextInt();
                    break;
                case 9:
                    System.out.println("Меню: ");
                    System.out.println("1 - Размеры хештаблицы ");
                    System.out.println("2 - Таблица не пуста? ");
                    System.out.println("3 - Введите ключ, чтобы проверить содержится ли");
                    System.out.println("4 - Введите значение, чтобы проверить содержится ли");
                    System.out.println("5 - Вставка пары, введите ключ и значение ");
                    System.out.println("6 - Введите ключ, который хотите удалить ");
                    System.out.println("7 - Получение новой коллекции, состоящей из всех значений");
                    System.out.println("8 - Получение новой коллекции, состоящей из всех ключей");
                    System.out.println("9 - Меню");
                    System.out.println("0 - Выход");
                    num = scanner.nextInt();
                    break;
                case 0:
                    System.out.println("Выход");
                    System.out.println("Очистка таблицы");
                    hashMap.clear();
                    System.out.println("Таблица пустая? " + hashMap.isEmpty());
                    bool = false;
                    break;
            }
        }
    }
}
