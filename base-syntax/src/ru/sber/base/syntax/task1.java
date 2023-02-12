package ru.sber.base.syntax;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Task1 {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader ()
        {
            br = new BufferedReader (new InputStreamReader (System.in));
        }

        String next ()
        {
            while (st == null || !st.hasMoreElements ())
            {
                try
                {
                    st = new StringTokenizer (br.readLine ());
                }
                catch (IOException e)
                {
                    e.printStackTrace ();
                }
            }
            return st.nextToken ();
        }
        int nextInt ()
        {
            return Integer.parseInt (next ());
        }
        long nextLong ()
        {
            return Long.parseLong (next ());
        }
    }
    public static void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int n = reader.nextInt();
        int[] sortArr = new int[n];
        for(int i = 0; i < n; i++){
            sortArr[i] = reader.nextInt();
        }
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i]);
        }
    }
}