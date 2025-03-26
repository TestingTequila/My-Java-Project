package com.janbask.java.day10.IncrementDecrementOperators;

public class PostIncrementOperators {

    //Assigning the value first and then incrementing it
    public static void main(String[] args)
    {
        int a = 1;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        int c = 100;
        int d =c++;
        System.out.println(c);
        System.out.println(d);

        int x =-99;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

    }

}
