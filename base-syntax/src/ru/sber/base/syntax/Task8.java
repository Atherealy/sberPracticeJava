package ru.sber.base.syntax;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String answer = "Троллейбус";
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while ((!answer.equals(s)) && (!s.equals("Сдаюсь"))){
            System.out. println("Подумай еще");
            s = in.nextLine();
        }
        if(answer.equals(s)){
            System.out.println("Правильно!");
        }else if (s.equals("Сдаюсь")){
            System.out.println("Правильный ответ: Троллейбус");
        }
    }
}
