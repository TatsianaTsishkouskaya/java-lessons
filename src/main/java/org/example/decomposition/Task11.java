package org.example.decomposition;

public class Task11 {

    public static int number(int a, int count) {
        count = count + 1;
        int new_a = a / 10;
        if (new_a==0){
            System.out.println("Число включает " + count + " цифры");
            return count;
        } else{
            return number(new_a, count);
        }
    }

    public static void compare(int firstCount, int secondCount){
        int result = firstCount - secondCount;
        if (result>0){
            System.out.println("Первое число больше второго на " + result + " цифры");
        } else if (result<0){
            System.out.println("Второе число больше первого на " + Math.abs(result) + " цифры");
        } else if (result==0){
            System.out.println("Количество цифр первого и второго чисел равны ");
        }
    }

    public static void main(String[] args){
        int count = 0;
        compare(number(1235, count), number(556, count));
    }
}
