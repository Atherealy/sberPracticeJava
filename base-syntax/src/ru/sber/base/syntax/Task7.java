package ru.sber.base.syntax;

public class Task7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n = 9;
        int sum_fib;
        System.out.print(a + " " + b + " ");
        for(int i = 0; i < n; i++){
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + " ");
        }
    }
}
