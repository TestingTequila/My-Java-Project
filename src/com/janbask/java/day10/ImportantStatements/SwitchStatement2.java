package com.janbask.java.day10.ImportantStatements;

public class SwitchStatement2
{
    public static void main(String[] args) {
        int marks= 100;

        switch (marks)
        {
            case 90:
                System.out.println("Outstanding..You got an A+");
                break;
            case 80:
                System.out.println("Excellent... you got an A");
                break;
            case 75:
                System.out.println("Very Good... you got an B+");
                break;
            case 70:
                System.out.println("Good... you got an B");
                break;
            case 65:
                System.out.println("Fair... you got an C+");
                break;
            case 50:
                System.out.println("Good... you got an C");
                break;
            default:
                System.out.println("Sorry...you couldn't make it...better luck next time..");
        }
    }
}


//This will not work for >, < >=,<=, i.e, range related conditions, That means this will work for exact value
//This will not work for && operator
//Switch won't work with long, float, double, boolean data types