package org.example.decomposition;

import java.util.Arrays;

public class Task4 {

    public static double[] dictance(double[][] array, double [] arrayMax) {
        double[] result = new double[array.length - 1];
        double dist = 0;
        double x1 = array[0][0];
        double y1 = array[0][1];
        for (int x2 = array.length - 1; x2 > 0; x2--) {
            dist = Math.sqrt(Math.pow((array[x2][0] - x1), 2) + Math.pow((array[x2][1] - y1), 2));
            result[x2 - 1] = dist;
        }
        double[] newArrayMax = new double[arrayMax.length + 1];
        for(int i = 0; i<arrayMax.length; i++ ){
            newArrayMax[i] = arrayMax[i];
        }
        newArrayMax[arrayMax.length] = max(result);


        double[][] newarray = Arrays.copyOfRange(array, 1, array.length);
        if (newarray.length>1){
            dictance(newarray, newArrayMax);

        }
        //exit from loop
        if (newarray.length==1) {
            double maxsimum = newArrayMax[0];
            for (int c=1; c< newArrayMax.length; c++){
                if (maxsimum<newArrayMax[c]){
                    maxsimum=newArrayMax[c];
                }
            }
            System.out.println("Answer: " + maxsimum);
        }
        return result;
    }

    public static double max(double[] result){
        double max = result[0];
        for (int a=0; a< result.length; a++){
            if (max<result[a]){
                max = result[a];
            }
        }
        return max;
    }

    public static void main (String[] args){
        double[][] array = {{-2,2},
                {2, 6},
                {7, 5},
                {10, -2}};
        double[] arrayMax = new double[0];
        dictance(array, arrayMax);
    }
}

