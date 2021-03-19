package org.example.string;

import java.util.Arrays;

public class Task2 {
    /*public static char[] replacement(int x, String str) {
        int count = 0;
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        for (int a = 0; a < array.length; a++) {
            if ((array[a] == 'w') && (array[a + 1] == 'o') && (array[a + 2] == 'r') && (array[a + 3] == 'd')) {
                count = count + 1;
            }
        }
        char[] newArray = new char[array.length + count * x];
        System.out.println("newArray.length= " + newArray.length);
        for (int b = 0; b < array.length; b++) {
            newArray[b] = array[b];
        }
        System.out.println("Newarray:" + Arrays.toString(newArray));
        return newArray;
    }*/

    public static int getCount(String str){
        int count = 0;
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        for (int a = 0; a < array.length; a++) {
            if ((array[a] == 'w') && (array[a + 1] == 'o') && (array[a + 2] == 'r') && (array[a + 3] == 'd')) {
                count = count + 1;
            }
        }
        System.out.println(count);
        return count;
    }

    public static char[] newArray(int count, int x, String str){
        char[] array = str.toCharArray();
        char[] newArray = new char[array.length + count * x];
        System.out.println("newArray.length= " + newArray.length);
        for (int b = 0; b < array.length; b++) {
            newArray[b] = array[b];
        }
        System.out.println("Newarray:" + Arrays.toString(newArray));
        return newArray;
    }





    public static void replacementFin(int count, int x, char[] newArray) {
        System.out.println("Count" + count);
        char[] newArrayFin = new char[newArray.length];

        for (int a = 0; a < newArray.length; a++) {
            if((newArray[a] == 'w') &&
                (a != newArray.length-3 || a != newArray.length-2 || a != newArray.length-1) &&
                    ((newArray[a + 1] == 'o') && (newArray[a + 2] == 'r') && (newArray[a + 3] == 'd'))){
                        for (int b = 0; b < a; b++) {
                            newArrayFin[b] = newArray[b];
                            newArrayFin[a] = 'l';
                            newArrayFin[a + 1] = 'e';
                            newArrayFin[a + 2] = 't';
                            newArrayFin[a + 3] = 't';
                            newArrayFin[a + 4] = 'e';
                            newArrayFin[a + 5] = 'r';
                            System.out.println("Final arrayFin:" + Arrays.toString(newArrayFin));
                        }
                        if (count==0) {
                            System.out.println("Final arrayFin:" + Arrays.toString(newArrayFin));
                            System.out.println(String.valueOf(newArrayFin));
                            break;
                        }else {
                            count--;
                            replacementFin(count, x, newArrayFin);
                        }
            } else {
                System.out.println("Copy 3");
                for (int a1 = a+4; a1 < newArray.length - x; a1++){
                    newArrayFin[a1+x] = newArray[a1];
                }
            }
        }
    }

    public static void main (String[]args){
        //String str = "word one star word name word";

        //String str = "ergy one star kiop name soft"; ?
        //String str = "word one star kiop name soft";
        //String str = "ergy one star word name soft";
        //String str = "ergy one star soft name word";
        String str = "word one star word name soft";
        //-String str = "pole one star word name word";
       //-String str = "st word name ywtr";
        //String str = "word one star wooi name word";
        int n = str.length();
        System.out.println("n=" + n);
        int w = "word".length();
        int l = "letter".length();
        int x = Math.abs(w - l);

        replacementFin(getCount(str), x, newArray(getCount(str), x, str ));
    }
}


/*


    public static char[] replacement(int x, String str, int count) {
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        for (int a = 0; a < array.length; a++) {
            if ((array[a] == 'w') && (array[a + 1] == 'o') && (array[a + 2] == 'r') && (array[a + 3] == 'd')) {
                count = count + 1;
            }
        }
        char[] newArray = new char[array.length + count * x];
        System.out.println("newArray.length= " + newArray.length);
        for (int b = 0; b < array.length; b++) {
            newArray[b] = array[b];
        }
        System.out.println("Newarray:" + Arrays.toString(newArray));
        return newArray;
    }

    public static void replacementFin(int w, int x, char[] newArray) {
        char[] newArrayFin = new char[newArray.length];
        for (int a = 0; a < newArray.length; a++) {
            if ((newArray[a] == 'w') && (newArray[a + 1] == 'o') && (newArray[a + 2] == 'r') && (newArray[a + 3] == 'd')) {
                for (int b = 0; b < a; b++) {
                    newArrayFin[b] = newArray[b];
                    newArrayFin[a] = 'l';
                    newArrayFin[a + 1] = 'e';
                    newArrayFin[a + 2] = 't';
                    newArrayFin[a + 3] = 't';
                    newArrayFin[a + 4] = 'e';
                    newArrayFin[a + 5] = 'r';
                    System.out.println("Final arrayFin:" + Arrays.toString(newArrayFin));
                }
                newArrayFin[a+5+1]=newArray[a+4];
                */
/*for (int b = a+w; b < newArray.length-x; b++) {
                    newArrayFin[b+x] = newArray[b];
                    newArrayFin[a] = 'l';
                    newArrayFin[a + 1] = 'e';
                    newArrayFin[a + 2] = 't';
                    newArrayFin[a + 3] = 't';
                    newArrayFin[a + 4] = 'e';
                    newArrayFin[a + 5] = 'r';
                }*//*

            } */
/*else {
                System.out.println("Word 'word' is absent");
                break;
            }*//*

        }
        for (int a = 0; a < newArrayFin.length; a++) {
            if ((newArrayFin[a] == 'w') && (newArrayFin[a + 1] == 'o') && (newArrayFin[a + 2] == 'r') && (newArrayFin[a + 3] == 'd')) {
                replacementFin(w, x, newArrayFin);
            } else {
                System.out.println("Final arrayFin:" + Arrays.toString(newArrayFin));
                System.out.println(String.valueOf(newArrayFin));
            }
            break;
        }
    }

    public static void main (String[]args){
        //String str = "word one star word name word";

        //String str = "ergy one star kiop name soft"; ?
        //String str = "word one star kiop name soft";
        //String str = "ergy one star word name soft";
        //String str = "ergy one star soft name word";
        //String str = "word one star word name soft";
        //String str = "pole one star word name word";
        String str = "st word na word";
        //String str = "word one star wooi name word";
        int n = str.length();
        System.out.println("n=" + n);
        int w = "word".length();
        int l = "letter".length();
        int x = Math.abs(w - l);
        int count = 0;
        replacementFin(w, x, replacement(x, str, count));
    }
*/
