package org.example.decomposition;

public class Task14 {
    public static void number(int a, double k, double sum_a) {
        if (a<k){
            int a3 = a%10;
            int a2 = a/10%10;
            int a1 = a/100%10;
            sum_a = a1 + a2 + a3;
            int count1 = a/10;
            int count2 = count1/10;
            int n1 = 1;
            int n2 = 2;
            int n3 = 3;
            if ((count1>0) & (count2==0)){
                if (a==Math.pow(sum_a, n2)){
                    System.out.println(a + " is Armstrong`s number ");
                }
            } else if ((count1>0) & (count2>0)){
                if (a==Math.pow(sum_a, n3)){
                    System.out.println(a + " is Armstrong`s number ");
                }
            } else {
                if (a==Math.pow(sum_a, n1)){
                    System.out.println(a + " is Armstrong`s number ");
                }
            }
            number(a+1, k, sum_a);
        }
    }

    public static void main(String[] args){
        int a = 1;
        int k = 999;
        double sum_a = 0;
        number(a, k, sum_a);
    }
}


