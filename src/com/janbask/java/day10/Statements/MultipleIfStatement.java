package com.janbask.java.day10.Statements;

public class MultipleIfStatement
{
    public static void main(String[] args) {
        int marks =50;
        if(marks>=90)
        {
            System.out.println("Excellent ..You got an A grade");
        }
        if(marks<90 && marks>=80)
        {
            System.out.println("Very Good..You got a B grade");
        }
        if(marks<80 && marks>=70)
        {
            System.out.println("Good...you got a C grade");
        }
        if(marks>70 && marks<=60)
        {
            System.out.println("Fair..you got a D grade");
        }
    }
}
