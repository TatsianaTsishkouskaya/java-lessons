package org.example.string;

import java.util.Arrays;

public class Task1 {
    public static void transformation(String[] name, String[] array) {
        for (int a = 0; a < name.length; a++) {
            String subStr = name[a];
            System.out.println("Before:" + subStr);
            String result = "";
            char first = subStr.charAt(0);
            result = result + Character.toLowerCase(first);
            for (int b = 1; b < subStr.length(); b++) {
                char another = subStr.charAt(b);
                if (Character.isUpperCase(another)) {
                    result = result + "_" + Character.toLowerCase(another);
                } else {
                    result = result + another;
                }
            }
            System.out.println("After:" + result);

            String[] newArray = new String[array.length + 1];
            for (int c = 0; c < array.length; c++) {
                newArray[c] = array[c];
            }
            newArray[array.length] = result;
            System.out.println(Arrays.toString(newArray) + "\n");

            if (newArray.length == name.length){
                System.out.println(Arrays.toString(newArray));
                break;
            }else {
                transformation(name, newArray);
            }
        }
    }


    public static void main (String[]args){
        String[] name = {"TonyaAlehina", "AlesyaBondareva", "NinaPotapenko", "TanyaMakarenko"};
        String[] array = new String[0];
        transformation(name, array);
    }
}




