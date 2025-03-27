package com.janbask.java.day10.ImportantStatements;

public class MultipleIfWithIfElseIfStatement
{
    public static void main(String[] args) {
        int marks =50;
        if(marks>=90)
        {
            System.out.println("Excellent ..You got an A grade");
        }
        else if(marks<90 && marks>=80)
        {
            System.out.println("Very Good..You got a B grade");
        }
        else if(marks<80 && marks>=70)
        {
            System.out.println("Good...you got a C grade");
        }
        else if(marks>70 && marks<=60)
        {
            System.out.println("Fair..you got a D grade");
        }
        else
        {
            System.out.println("Sorry ...better luck next time");
        }
    }
}
