package com.janbask.java.day9.StringConcatenation;

public class StringConcatenation {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "World";
        int a = 10;
        int b = 20;
        float f = 44.45F;
        System.out.println(x);//Hello
        System.out.println(y);//World
        System.out.println(x + y);//HelloWorld
        System.out.println(y + x);//WorldHello
        System.out.println(a);//10
        System.out.println(b);//20
        System.out.println(a + b);//30
        System.out.println(x + a); //Hello10
        System.out.println(x + y + a);//HelloWorld10
        System.out.println(a + b + x); //30Hello
        System.out.println(a + x + b + y);//10Hello20World
        System.out.println(a + b + x + y);//30HelloWorld
        System.out.println(x + y + a + b + x + y);//HelloWorld1020HelloWorld
        System.out.println(a + b + x + y + a + b);//30HelloWorld1020
        System.out.println(a + b + x + y + (a + b));//30HelloWorld30
        System.out.println(a+f+x+a+b+f);//54.45Hello102044.45
        System.out.println(a+f+x+(a+b)+f);//54.45Hello(30)44.45
        System.out.println("The sum of a and b is " + (a+b));

    }
}
