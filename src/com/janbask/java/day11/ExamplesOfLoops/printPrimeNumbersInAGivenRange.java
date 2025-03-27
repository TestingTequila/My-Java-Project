package com.janbask.java.day11.ExamplesOfLoops;

public class printPrimeNumbersInAGivenRange {
    public static void main(String[] args) {
        // 1 to 100

        int count = 0;
        for (int i = 1; i < 100; i++) //i=1
        {
            for (int j = 1; j <= i; j++) //j=1
            {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(i + " : is a prime Number");
            }
            count = 0;
        }

    }
}
