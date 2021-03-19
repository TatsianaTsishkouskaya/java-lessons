package org.example.decomposition;

public class Task2 {
    public static int gcd1 (int a, int b){
        if (b==0){
            return a;
        }
        return gcd1(b, a%b);
    }

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int divisor = gcd1(a, b);
        int divisor1= gcd1(divisor, c);
        int result=  gcd1(divisor1, d);
        System.out.println("Result: " + result);
    }
}
