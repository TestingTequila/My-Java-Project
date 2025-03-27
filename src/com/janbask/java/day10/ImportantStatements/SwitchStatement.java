package com.janbask.java.day10.ImportantStatements;

public class SwitchStatement
{
    public static void main(String[] args) {
        String browserName = "Chrome";

        switch (browserName)
        {
            case "Edge":
                System.out.println("Launching Edge Browser");
                break;
            case "Firefox":
                System.out.println("Launching Firefox Browser");
                break;
            case "Safari":
                System.out.println("Launching Safari Browser");
                break;
            case "Chrome":
                System.out.println("Launching Chrome Browser");
                break;
            case "IE":
                System.out.println("Launching IE Browser");
                break;
            default:
                System.out.println("Enter a valid browser Name");
                break;
        }
    }
}
