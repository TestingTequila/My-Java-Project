package com.janbask.java.Loops.WhileLoop;

public class WhileLoopWithStatement
{
    public static void main(String[] args) {
        System.out.println("======Print number=================");
        int x =1;
        while (x<=100)
        {
            if(x%5!=0) {
                System.out.println(x);
            }
            x++;
        }


    }
}

