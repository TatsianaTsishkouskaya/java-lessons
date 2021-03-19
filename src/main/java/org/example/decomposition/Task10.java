package org.example.decomposition;

import java.util.Arrays;

public class Task10 {
    public static int[] number(int a, int[] array) {
        int result = a % 10;
        int[] newarray = new int[array.length + 1];
        for(int i = 0; i< array.length; i++){
            newarray[i] = array[i];
        }
        newarray[array.length] = result;
        int new_a = a / 10;
        if (new_a > 0) {
            number(new_a, newarray);
        }
        Arrays.sort(newarray);
        if (new_a==0) {
            System.out.println(Arrays.toString(newarray));
        }
        return newarray;
    }

    public static void main (String[] args){
        int[] array = new int[0];
        number(1233356789, array);
    }
}
