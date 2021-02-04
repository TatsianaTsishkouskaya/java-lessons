package org.example;

public class Branching {

    // Branching #1
    public static String triangel (int corner1, int corner2){
        String result;
        int corner3;
        corner3 = 180 - (corner1 + corner2);
        if ((corner1 <= 0) | (corner2 <= 0)) {
            result="Угол треугольника не может быть отрицательным или равным нулю";
        }
        if (corner3 > 0) {
            result="Такой треугольник существует";
        } else {
            result="Угол треугольника не может быть отрицательным числом или равным нулю";
        }
        if ((corner1 == 90) | (corner2 == 90) | (corner3 == 90)) {
            result="Треугольник является прямоугольным";
        } else {
            result="Треугольник НЕ является прямоугольным";
        }
        return result;
    }


    // Branching #2
    public static int max (int a, int b, int c, int d){
        int min_x;
        int min_y;
        if (a<=b){
            min_x=a;
        }else {
            min_x=b;
        }
        if (c<=d){
            min_y=c;
        } else {
            min_y=d;
        }
        if (min_x>min_y) {
            return min_x;
        } else {
            return min_y;
        }
    }

    // Branching #3
    public static String segment (int x1, int y1, int x2, int y2, int x3, int y3){
        //x1, y1-координаты точки A;
        //x2, y2-координаты точки B;
        //x3, y3-координаты точки C;
        //x0, y0-координаты начала отрезка;
        //x4, y4-координаты конца отрезка;
        int x0=1;
        int y0=1;
        int x4=12;
        int y4=12;
        int segmentTest=((x1-x0)*(y4-y0))-((y1-y0)*(x4-x0))+((x2-x0)*(y4-y0))-((y2-y0)*(x4-x0))+((x3-x0)*(y4-y0))-((y3-y0)*(x4-x0));
        if ((segmentTest==0) & (((x0<x1)&(x1<x4)) & ((x0<x2)&(x2<x4)) & ((x0<x3)&(x3<x4)) & ((y0<y1)&(y1<y4)) & ((y0<y2)&(y2<y4)) & ((y0<y3)&(y3<y4)))){
            return "точки расположены на одной прямой";
        }     else {
            return "точки НЕ расположены на одной прямой";
        }
    }


    // Branching #4
    public static String hole (int a, int b, int x, int y, int z){
        //a,b-размеры отверстия;
        //x,y,z-размеры кирпича;
        if ((a<0)|(b<0)|(x<0)|(y<0)|(z<0)){
            return "такого отверстия и/или кирпича не существует";
        }
        if (((x<=a)&(y<=b))|((x<=b)&(y<=a))|((x<=a)&(z<=b))|((x<=b)&(z<=a))|((y<=a)&(z<=b))|((y<=b)&(z<=a))) {
            return "кирпич проходит в отверстие";
        } else {
            return "кирпич НЕ проходит в отверстие";
        }
    }


    // Branching #5
    public static double function (double x){
        if (x<=3){
            return Math.pow(x, 2)-(3*x)+9;
        } else {
            return 1/(Math.pow(x, 3)+6);
        }
    }
    public static void main (String [] args){
        System.out.println("Решение задачи 1:" +triangel(45, 90));
        System.out.println("Решение задачи 2:" +max(1,2,3, 4));
        System.out.println("Решение задачи 3:" +segment(2,6,4,4,6,6));
        System.out.println("Решение задачи 4:" +hole(4, 4, 2, 4, 5));
        System.out.println("Решение задачи 5:" +function(-1));
    }
}
