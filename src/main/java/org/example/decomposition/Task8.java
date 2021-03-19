package org.example.decomposition;

public class Task8 {
    public static int sum (int[] array, int k, int m){
        int sum = 0;
        for (int a=k; k<=m; k++){
            sum = sum + array[k];
        }
        System.out.println("Sum = " + sum);
        return sum;
    }

    public static void main (String[] args){
        int[] array = {5, 10, 15, 20, 25, 30};
        int sum1 = sum(array, 0, 2);
        int sum2 = sum(array, 2, 4);
        int sum3 =sum(array, 3, 5);
    }
}
