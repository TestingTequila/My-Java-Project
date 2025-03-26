package com.janbask.java.day10.Statements;

public class MultipleIfWithElseStatement
{
    public static void main(String[] args) {
        if(false)
        {
            System.out.println("A");
        }
        if(false)
        {
            System.out.println("B");
        }
        if(true)
        {
            System.out.println("C");
        }
        if(false)
        {
            System.out.println("D");
        }
        if(false)
        {
            System.out.println("E");
        }
        if(true)
        {
            System.out.println("F");
        }
        if(false)
        {
            System.out.println("G");
        }
        else
        {
            System.out.println("this will execute only all the above condition fails...");
        }
    }
}
