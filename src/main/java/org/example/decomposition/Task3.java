package org.example.decomposition;

public class Task3 {
    public static double triangle(double a){
        return (Math.pow(a, 2)*Math.sqrt(3))/4;
    }

    public static double hexagon (double a){
        return  6*triangle(a);
    }

    public static void main (String[] args){
        double area = hexagon(2.0);
        System.out.printf("%.4f", area);
    }
}
