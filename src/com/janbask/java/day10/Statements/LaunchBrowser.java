package com.janbask.java.day10.Statements;

public class LaunchBrowser
{
    public static void main(String[] args) {
        String browserName = "Chrome";
        if(browserName.equals("Edge"))
        {
            System.out.println("Launch Edge to test the scenario");
        }
        else if (browserName.equals("IE"))
        {
            System.out.println("Launch IE to test the scenario");
        }
        else if (browserName.equals("safari"))
        {
            System.out.println("Launch safari to test the scenario");
        }
        else if (browserName.equals("Chrome"))
        {
            System.out.println("Launch Chrome to test the scenario");
        }
        else
        {
            System.out.println("Enter a valid browser...");
        }

    }
}
