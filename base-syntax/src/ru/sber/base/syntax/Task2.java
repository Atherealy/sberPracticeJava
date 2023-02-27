package ru.sber.base.syntax;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Task2 {
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
    public static void quickSort(int[] sortArr, int low, int high) {
        if (sortArr.length == 0 || low >= high) return;
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }
    public static void main(String[] args) {
        Task1.FastReader reader = new Task1.FastReader();
        int n = reader.nextInt();
        int[] sortArr = new int[n];
        for(int i = 0; i < n; i++){
            sortArr[i] = reader.nextInt();
        }
        quickSort(sortArr, 0, sortArr.length - 1);
        for(int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i]);
        }
    }
}
