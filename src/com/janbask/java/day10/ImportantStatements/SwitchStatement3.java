package com.janbask.java.day10.ImportantStatements;

public class SwitchStatement3
{
    public static void main(String[] args) {
        String dayOfWeek= "Wednesday";
        switch (dayOfWeek)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Its weekday...we have our offices");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Its Weekend...we can go out for dinner");
                break;
            default:
                System.out.println("Please enter Correct Day");

        }
    }


}
