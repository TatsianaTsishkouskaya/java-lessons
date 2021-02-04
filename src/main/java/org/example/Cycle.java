package org.example;

import java.math.BigInteger;
import java.util.Scanner;


public class Cycle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Ответ на первую задачу:" + sum(11));
        function(-2, 8, 2);
        System.out.println("Ответ на третью задачу:" + sumSquare());
        System.out.println("Ответ на четвертую задачу:" + multi());
        System.out.println("Ответ на пятую задачу:" + numberRow(4, 0.36));
        ascii();
        naturalNumber(in);
        numbers(in);
        in.close();




    }

    //Cycle #1
    public static int sum(int value) {
        int sum = 0;
        if (value > 0) {
            for (int a = 1; a < value; a++) {
                sum = sum + a;
            }
        }
        return sum;
    }

    //Cycle #2
    public static void function(int a, int b, int h) {
        int y=0;
        for (int x = a; x <= b; x+=h) {
            if (x <= 2) {
                y = -x;
            } else {
                y = x;
            }
            System.out.println("Ответ на вторую задачу:" + "x: " + x + " y:" + y);
        }
    }


    //Cycle #3
    public static int sumSquare() {
        int x = 1;
        int y;
        int sumSquare = 0;
        while (x <= 100) {
            y = x * x;
            sumSquare = sumSquare + y;
            x++;
        }
        return sumSquare;
    }

    //Cycle #4
    public static BigInteger multi() {
        BigInteger a = BigInteger.valueOf(1);
        for (int x = 2; x <= 200; x++) {
            a = a.multiply(BigInteger.valueOf((long) x * x));
        }
        return a;
    }

    //Cycle #5
    public static double numberRow(int n, double e) {
        double aN = 0;
        double sum_aN = 0;
        for (int x = 0; x < n; x++) {
            aN = Math.abs((1 / (Math.pow(2, x))) + (1 / (Math.pow(3, x))));
            if (aN >= e) {
                sum_aN = sum_aN + aN;
            }

        }
        return sum_aN;
    }


    //Cycle #6
    public static void ascii() {
        for (int i = 100; i < 105; i++) {
            char myChar = (char) i;
            String asciiOct = Integer.toOctalString(i);
            String asciiHex = Integer.toHexString(i);
            System.out.print(String.format("Ответ на шестую задачу:" + " " + "%03d %3s %5s %4s%n", i, myChar, asciiOct, asciiHex));
        }

    }

    //Cycle #7
    public static void naturalNumber (Scanner in){
        int y;
        int x;
        System.out.print("Введите m:");
        int m=in.nextInt();
        System.out.print("Введите n:");
        int n=in.nextInt();
        if (m>0 & n>0){
            while (m <= n) {
                y = m;
                System.out.println("Натуральное число в промежутке от m до n:" + " " + y);
                for (int a = 2; a < y; a++) {
                    if (y % a == 0) {
                        System.out.println("Делитель:" + " " + a);
                    }
                }
                m++;
            }
        } else {
            System.out.println("m и n должны быть больше 0");
        }
    }

    //Cycle #8
    public static void numbers(Scanner in) {
        int x;
        int y;
        System.out.print("Введите a:");
        int a = in.nextInt();
        System.out.print("Введите b:");
        int b = in.nextInt();
        if ((a < 0) | (b < 0)) {
            a = Math.abs(a);
            b = Math.abs(b);
        }
        int lengthA = 0;
        int tempA=a;
        while (tempA > 0) {
            x = tempA % 10;
            tempA = tempA / 10;
            lengthA++;
        }

        int[] arrayA = new int [lengthA];
        for(int i=0; i<lengthA; i++){
            x = a % 10;
            a = a / 10;
            arrayA[i] = x;
        }

        int lengthB=0;
        int tempB=b;
        while (tempB > 0) {
            y = tempB % 10;
            tempB = tempB / 10;
            lengthB++;
        }

        int [] arrayB=new int[lengthB];
        for (int c=0; c<lengthB; c++){
            y = b % 10;
            b = b / 10;
            arrayB [c]=y;
        }

        for (int i=0; i<lengthA; i++){
            for (int c=0; c<lengthB; c++){
                if (arrayA[i]==arrayB[c]){
                    System.out.println("В первом и втором числе есть цифра:" + arrayA[i]);
                }
            }
        }
    }
}





