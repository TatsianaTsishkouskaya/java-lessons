package org.example.decomposition;

public class Task5 {

    public static void sorting(int[] array){
        int max = array[0];
        for (int a=0; a<array.length; a++){
            for (int b=a+1; b<array.length; b++)
                if (array[a]>array[b]){
                    int tmp = array[b];
                    array[b] = array[a];
                    array[a] = tmp;
                }
        }
        System.out.println("Second max number is:"+ " " + array[array.length-2]);
    }

    public static void main(String[] args){
        int[] array = {0, 6, -8, 70, -5, 100, 1, -3};
        sorting(array);
    }
}
