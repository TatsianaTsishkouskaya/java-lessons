package org.example.decomposition;

import java.util.Arrays;

public class Task12 {

    public static int[] sum(int x, int k, int n, int[] array) {
        for (int a = x; a < n; a++) {
            int b3 = a % 10;
            int b2 = a / 10 % 10;
            int b1 = a / 100 % 10;
            int b = b3 + b2 + b1;
            if (b == k) {
                int[] new_array = new int[array.length+1];
                for (int c=0; c<array.length; c++){
                    new_array[c]=array[c];
                }
                new_array[array.length] = a;
                System.out.println(Arrays.toString(new_array));
                return sum(a+1, k, n, new_array);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int k = 12;
        int n = 300;
        int[] array = new int[0];
        sum(10, k, n, array);
    }
}


