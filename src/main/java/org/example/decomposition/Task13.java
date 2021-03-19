package org.example.decomposition;

import java.util.Scanner;

public class Task13 {

    public static void twins(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число n, которое больше 2: ");
        int n = in.nextInt();
        int n2 = n*2;
        for (int a=n; a<=n2; a++) {
            if ((a + 2) <= n2) {
                int twins = a + 2;
                System.out.println("Twins of " + a + " is: " + twins);
            } else {
                break;
            }
        }
        in.close();
    }

    public static void main(String[] args){
        twins();
    }
}
