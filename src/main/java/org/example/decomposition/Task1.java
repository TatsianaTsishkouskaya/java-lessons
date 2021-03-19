package org.example.decomposition;

public class Task1 {
    public static int gcd (int  a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static int gcm (int a, int b){
        return a*b/gcd(a, b);
    }

    public static void main (String[] args){
        int multiple = gcm(15, 4);
        System.out.println(multiple);
    }
}
