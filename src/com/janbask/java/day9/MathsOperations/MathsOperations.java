package com.janbask.java.day9.MathsOperations;

public class MathsOperations
{
    public static void main(String[] args) {
        //1. Integer /Integer = Integer part
        System.out.println(10/3); //3
        int number = 123456;
        System.out.println(number/10);

        //2. Decimal in either numerator/Denominator ==> Decimal
        System.out.println(10/2.1);//4.761904761904762
        System.out.println(12.45/6);//2.0749999999999997
        System.out.println(10.0/2);//5.0
        System.out.println(10.0/3);//3.3333333333333335

        //3. Modulo Operator (%)
        System.out.println(10%2);//0
        System.out.println(10%3);//1
        System.out.println(12.33%10);//2.33

    }
}
