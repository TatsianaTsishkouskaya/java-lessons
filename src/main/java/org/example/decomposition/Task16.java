package org.example.decomposition;

import java.util.Arrays;

public class Task16 {
    public static int[] number(int a, int[] array, int count) {
        int result = a % 10;
        count = count + 1;
        int[] newarray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        newarray[count - 1] = result;
        int new_a = a / 10;
        if (new_a == 0) {
            System.out.println(Arrays.toString(newarray));
            return newarray;
        }
        if (new_a > 0) {
            return number(new_a, newarray, count);
        }
        return newarray;
    }

    public static int sum(int[] newarray, int sumNechet, int countNechet){
        for (int a=0; a<newarray.length; a++){
            if (newarray[a]%2==0){
                System.out.println("В число входят четные цифры");
                break;
            } else {
                countNechet = countNechet + 1;
                if (countNechet==newarray.length){
                    for (int b=0; b<newarray.length; b++) {
                        sumNechet = sumNechet + newarray[b];
                    }
                }
            }
        }
        System.out.println("Sum= " + sumNechet);
        return sumNechet;
    }

    public static int countChet(int sum, int countChet){
        int result = sum % 10;
        if (result%2==0){
            countChet = countChet + 1;
        }
        int new_sum = sum/10;
        if (new_sum==0){
            return countChet;
        }
        if (new_sum%2==0){
            countChet(new_sum, countChet);
        }
        if (countChet==0){
            System.out.println("В сумме нет четных цифр");
        } else {
            System.out.println("В сумме " + countChet + " четных цифры");
        }
        return countChet;
    }


    public static void main(String[] args){
        int[] array = new int[0];
        int count = 0;
        int countNechet = 0;
        int countChet = 0;
        int sumNechet = 0;
        countChet(sum(number(99999999, array, count), sumNechet, countNechet), countChet);
    }
}
