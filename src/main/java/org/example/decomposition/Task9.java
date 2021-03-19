package org.example.decomposition;

public class Task9 {

    public static double triangle(double x, double y, double z){
        double sqTriangle = (y*(x-z))/2;
        return sqTriangle;
    }

    public static double rectangle(double y, double z){
        double sqRectangle = y*z;
        return sqRectangle;
    }

    public static double square (double sqTriangle, double sqRectangle){
        double result = sqTriangle + sqRectangle;
        System.out.println("Square is: " + result);
        return result;
    }


    public static void main(String[] args){
        double x = 20;
        double y = 8;
        double z = 15;
        double t = 12;
        square(triangle(20, 8, 15), rectangle(8, 15));
    }
}
