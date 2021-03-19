package org.example.decomposition;

public class Task6 {
    public static int simple1(int a, int b){
        if (b==0){
            return a;
        }
        return simple1(b, a%b);
    }

    public static void comparison(int result1, int result2, int result3, int a, int b, int c){
        if ((result1==1) & (result2==1) & (result3==1)){
            System.out.println("Числа " + a + ", " + b + ", " + c + " являются взаимно простыми");
        } else {
            System.out.println("Числа " + a + ", " + b + ", " + c + "  НЕ являются взаимно простыми");
        }
    }

    public static void main(String[] args){
        int a = 9;
        int b = 3;
        int c = 8;
        int result1 = simple1(9, 3);
        int result2 = simple1(9, 8);
        int result3 = simple1(8, 3);
        comparison(result1, result2, result3, a, b, c);
    }
}
