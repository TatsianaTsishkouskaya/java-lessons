package org.example.decomposition;

public class Task15 {
    public static void number(int a, int k){
        if (a<k){
            int a4 = a%10;
            int a3 = a/10%10;
            int a2 = a/100%10;
            int a1 = a/1000;
            if ((a1==a2-1) & (a2==a3-1) & (a3==a4-1)){
                System.out.println(a);
            }
            number(a+1, k);
        }
    }

    public static void main(String[] args){
        number(1000, 7000);
    }
}
