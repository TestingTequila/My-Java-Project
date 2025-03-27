package com.janbask.java.Loops.ExamplesOfLoops;

public class PrintDigitsOfANumber
{
    public static void main(String[] args) {
        int number = 12345;

        while (number!=0)
        {
            int digit = number%10;//5
            System.out.println(digit);//5
            number = number/10;//1234
        }
    }


}
