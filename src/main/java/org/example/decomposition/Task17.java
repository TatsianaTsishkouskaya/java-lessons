package org.example.decomposition;

public class Task17 {
    public static int number(int a, int[] array, int count, int sum) {
        int result = a % 10;
        count = count + 1;
        int[] newarray = new int[array.length + 1];
        for(int i = 0; i< array.length; i++){
            newarray[i] = array[i];
        }
        newarray[count - 1] = result;
        sum = sum + newarray[count-1];
        int new_a = a / 10;
        if (new_a==0) {
            return sum;
        }
        if (new_a > 0) {
            return number(new_a, newarray, count, sum);
        }
        return sum;
    }

    public static int result(int a, int newCount, int res,  int sum){
        res = a - sum;
        int newA = res;
        newCount = newCount + 1;
        if (res==0 || res<sum){
            System.out.println(newCount+ " times");
            return newCount;
        } else {
            return result(newA, newCount, res, sum);
        }
    }

    public static void main (String[] args){
        int[] array = new int[0];
        int count = 0;
        int sum = 0;
        int newCount = 0;
        int res = 0;
        result(12, newCount, res, number(12, array, count, sum));
    }
}
