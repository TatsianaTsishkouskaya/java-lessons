package org.example;

public class LineProgram {

    public static void main (String [] args){
        System.out.println("Ответ на первое задание: z= " + function1(3.0,1.0,8.0));
        System.out.println("Ответ на второе задание: " + function2(2.0,8.0,3.0,1.0));
        System.out.println("Ответ на третье задание: " + function3(45,90));
        System.out.println("Ответ на четвертое задание: " + function4(123.456));
        System.out.println("Ответ на пятое задание: " + function5(10000));
        function6(3,8);
    }

    // Liner Program #6
    public static void function6 (int x, int y){
        System.out.println("Ответ на шестое задание:");
        int [] [] array={{0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

        if (array[x][y] == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    // Liner Program #5
    public static String function5 (int x){
        final int SECONDSINHOUR=3600;
        final int SECONDSINMINUTE=60;
        int hour;
        int minute;
        int second;
        hour=x/SECONDSINHOUR;
        minute=(x-hour*SECONDSINHOUR)/SECONDSINMINUTE;
        second=x-hour*SECONDSINHOUR-minute*SECONDSINMINUTE;
        String hour_st=Integer.toString(hour);
        String minute_st=Integer.toString(minute);
        String second_st=Integer.toString(second);
        return hour_st+ "ч" +minute_st+ "мин" +second_st+ "сек";
    }


    // Liner Program #4
    public static double function4 (double x){
        double y;
        return y=(x*1000)%1000+(int)x/1000.0;
    }

    //Liner Program #3
    public static double function3 (double x, double y){
        double xR=Math.toRadians(x);
        double yR=Math.toRadians(y);
        return (Math.sin(xR)+Math.cos(yR))/(Math.cos(xR)-Math.sin(yR))*(Math.tan(xR)*y);
    }

    //Linear Program #2
    public static double function2 (double a, double b, double c, double d){
        final byte POWER_1=2;
        final byte POWER_2=3;
        final byte POWER_3=-2;
        return (b+Math.sqrt(Math.pow(b, POWER_1)+4*a*c))/(2*a)-Math.pow(a,POWER_2)*c+Math.pow(b,POWER_3);
    }

    //Linear Program #1
    public static double function1 (double a, double b, double c){
        return ((a-3)*b/2)+c;
    }
}
