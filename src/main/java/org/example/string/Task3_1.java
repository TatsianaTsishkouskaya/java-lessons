package org.example.string;

public class Task3_1 {
    public static void numeral(String str){
        int count = 0;
        for (int a = 0; a < str.length(); a++){
            if (Character.isDigit(str.charAt(a))){
                count = count + 1;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args){
        String str = "Minsk 12734 Mogilev 7886 Brest 905";
        numeral(str);
    }
}


