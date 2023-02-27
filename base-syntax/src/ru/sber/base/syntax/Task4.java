package ru.sber.base.syntax;
import java.lang.Math;
public class Task4 {
    public static void main(String[] args) {
        int x = (int)(Math.random()*100);
        double[] Array = new double[x];
        for(int i = 0; i < x; i++){
            Array[i] = Math.random();
        }
        double max = Array[0];
        for(int i = 0; i < Array.length; i++){
            if(max < Array[i]){
                max = Array[i];
            }
        }
        System.out.println(max);
        double avg = 0;
        for(int i = 0; i < Array.length; i++){
            avg += (double) Array[i]/Array.length;
            }
        System.out.println(avg);

    }
}