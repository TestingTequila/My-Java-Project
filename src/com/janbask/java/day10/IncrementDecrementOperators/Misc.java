package com.janbask.java.day10.IncrementDecrementOperators;

public class Misc
{
    public static void main(String[] args) {
        int num =10;
        System.out.println(num++);//10
        System.out.println(num);//11

        int x = -55;
        System.out.println(x++); //-55
        System.out.println(x);//-54

        int a = 12;
        System.out.println(++a);//13
        System.out.println(a);  //13

        float f = 12.34F;
        System.out.println(f++);//12.34
        System.out.println(f);//13.34

        char c = 'a';
        System.out.println(c++);//a
        System.out.println(c);//b


        char ch = 'a';
        System.out.println(++ch);//b
        System.out.println((int)ch);//b

        System.out.println("==========================");

        int m = 200;
        int n = m++;
        System.out.println(--m);//200
        System.out.println(m);//200
        System.out.println(m++);//200
        System.out.println(m--);//201
        System.out.println(--m);//199
        System.out.println(m);//199


    }
}
