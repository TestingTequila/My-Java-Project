package com.janbask.java.day10.IncrementDecrementOperators;

public class PostDecrementOperators {
    public static void main(String[] args)
    {
        int a = 1;
        int b = a--;
        System.out.println(a);//0
        System.out.println(b);//1

        int c = 100;
        int d =c--;
        System.out.println(c);//99
        System.out.println(d);//100

        int x =-99;
        int y = x--;
        System.out.println(x);//-100
        System.out.println(y);//-99

    }

}
