package org.example.decomposition;

import java.util.Arrays;

public class Task7 {
    public static int factorial(int[] array, int[] newarray){
        int n = newarray[0];
        int result = 1;
        for (int a=0; a<n; a++){
            result = result*array[a];
        }
        System.out.println("Factorial" + " " + n + " = " + result);
        int[] newarray_copy = new int[newarray.length - 1];
        newarray_copy = Arrays.copyOfRange(newarray, 1, newarray.length);
        if (newarray_copy.length!=0){
            factorial(array, newarray_copy);
        }
        return result;
    }

    public static int[] number(int[] array){
        int[] newarray = new int[array.length/2];
        int x = 1;
        for (int a=0; a<array.length; a++) {
            if (array[a] % 2 != 0) {
                newarray[x - 1] = array[a];
                x++;
            }
        }
        System.out.println("Нужно найти факториалы чисел: " + Arrays.toString(newarray));
        return newarray;
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       factorial(array, number(array));
    }
}
