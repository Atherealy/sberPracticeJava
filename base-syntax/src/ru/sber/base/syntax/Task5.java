package ru.sber.base.syntax;

public class Task5 {
    public static void main(String[] args) {
        int x = 2, y = 1;
        for(int i = 2; i < 100; i++){
            while(x <= i) {
                if (i % x == 0) {
                    y++;
                }
                x++;
            }
            x = 2;
            if(y == 2){
                System.out.println(i);
                y = 1;
            }else{
                y = 1;
            }

        }
    }
}
