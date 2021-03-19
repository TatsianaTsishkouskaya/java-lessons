package org.example.string;

import java.util.Arrays;

public class Task5 {
    public static int count(char[] array, int count) {
        for (int a = 0; a < array.length - 1; a++) {
            int b = a + 1;
            if (Character.isWhitespace(array[a]) & Character.isWhitespace(array[b])) {
                count = count + 1;
            }
        }
        return count;
    }

    public static char[] replace(char[] array, int count){
        char[] result = null;
        if (count==0){
            System.out.println(array);
            result = array;
        } else {
            for (int a = 0; a < array.length - 1; a++) {
                int b = a + 1;
                if (Character.isWhitespace(array[a]) & Character.isWhitespace(array[b])) {
                    char[] newArray = new char[array.length - 1];
                    for (int c = 0; c < a; c++) {
                        newArray[c] = array[c];
                    }
                    for (int d = a + 1; d < array.length; d++) {
                        newArray[d - 1] = array[d];
                    }
                    count--;
                    int newCount = count;
                    if (newCount == 0) {
                        result = newArray;
                        break;
                    } else {
                        result = replace(newArray, newCount);
                    }
                    break;
                }
            }
        }
        return  result;
    }

    public static void replaceFin(char[] newArray){
        int finalCount = 0;
        if ((Character.isWhitespace(newArray[0]))){
            finalCount = finalCount + 1;
        }
        if (Character.isWhitespace(newArray[newArray.length-1])){
            finalCount = finalCount + 1;
        }
        if (finalCount==0){
            System.out.println("FinalArray: " + Arrays.toString(newArray));
        }
        if (finalCount==1 & Character.isWhitespace(newArray[0])){
            char[] finalArray = new char[newArray.length - finalCount];
            for (int b = 0; b<finalArray.length; b++){
                finalArray[b] = newArray[b+1];
            }
            System.out.println("FinalArray: " + Arrays.toString(finalArray));
        }
        if (finalCount==1 & Character.isWhitespace(newArray[newArray.length-1])){
            char[] finalArray = new char[newArray.length - finalCount];
            for (int b = 0; b<finalArray.length; b++){
                finalArray[b] = newArray[b];
            }
            System.out.println("FinalArray: " + Arrays.toString(finalArray));
        }
        if (finalCount==2 & Character.isWhitespace(newArray[newArray.length-1]) &Character.isWhitespace(newArray[0])){
            char[] finalArray = new char[newArray.length - finalCount];
            for (int b = 0; b<finalArray.length; b++){
                finalArray[b] = newArray[b+1];
            }
            System.out.println("FinalArray: " + Arrays.toString(finalArray));
        }
    }

    public static void main (String[]args){
        String str = "  My     name is Tanya     ";
        char[] array = str.toCharArray();
        System.out.println("Before:" + Arrays.toString(array));
        int count = 0;
        replaceFin(replace(array, count(array, count)));
    }
}





