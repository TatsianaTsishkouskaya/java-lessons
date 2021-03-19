package org.example.string;

import java.util.Arrays;

public class Task4 {
    public static void number(String str, int count) {
        String[] subStr = str.split(" ");
        System.out.println(Arrays.toString(subStr));

        for (int a = 0; a < subStr.length; a++) {
            char[] array = subStr[a].toCharArray();
            System.out.println(Arrays.toString(array));
           /* for (int b = 0)
            if (Character.isDigit(array[a])) {
                count = count + 1;
            }*/

        }
        System.out.println(count);
        /*for (int a = 0; a < subStr.length; a++){
            if (Character.isDigit(a)){
                count = count + 1;
            }
            System.out.println(count);
        }*/
    }



    public static void main(String[] args){
        String str = "258 Minsk 12734 Mogilev7 7886 Brest 905";
        int count = 0;
        number(str, count);
    }
}
