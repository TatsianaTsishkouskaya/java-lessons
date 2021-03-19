package org.example.string;

import java.util.Arrays;

public class Task3 {
    public static void numeral(String str){
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int a=0; a< array.length; a++){
            if ((array[a]=='0') || (array[a]=='1') || (array[a]=='2') || (array[a]=='3') || (array[a]=='4') || (array[a]=='5') || (array[a]=='6') || (array[a]=='7') || (array[a]=='8') || (array[a]=='9')){
            count = count + 1;
            }
        }
        System.out.println("The line includes " + count + " numerals");
    }

    public static void main(String[] args){
        String str = "Minsk 12734 Mogilev 7886 Brest 905";
        numeral(str);
    }
}




