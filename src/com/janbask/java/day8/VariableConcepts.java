package com.janbask.java.day8;

public class VariableConcepts {
    public static void main(String[] args) {

        //10

        byte a = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 2147483648L;

//        System.out.println(a);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);

        float f = 10.123456789F; //4 Byte, up to 6-7 decimal places
        System.out.println(f);
        double d = 10.1234567890123456789; //8 Byte, beyond 6-7 decimal places, up-to 15 decimal Places
        System.out.println(d);

        float f1 = (float) 55.67;
        System.out.println(f1);

        System.out.println("===============CHAR DATA TYPE=======================");
        char c1 = 'a'; //97
        char c11 = 'b';//98
        char c2 = 'z';
        char c3 = '1';
        char c4 = '9';
        char c5 = '!';
        char c6 = '+';
        char gender = 'm';
        System.out.println(c1);
        System.out.println(c11);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(gender);
        System.out.println("============Mathematical Operations on CHAR data types==============");
        System.out.println(c1 + c11);//195

        System.out.println(gender + c3);//109+49
        System.out.println((int) 'a');
        System.out.println((int) gender);
        System.out.println((char) 97);
        System.out.println((int)'=');

        char u1 = 'a';
        char u2 = 'b';
        System.out.println(u1);//97
        System.out.println(u2);//98
        System.out.println(u1*u2);//97*98 =9506
        System.out.println((int)u1+(int)u2);//195
        System.out.println(u1+0);//97
        System.out.println((int)'0');
        System.out.println(u1+'0');//97+48

        //[a-z][A-Z][1-10][!@#$%^&*()_-+=]

        //boolean [~1 bit]{true, false}
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        //10;

    }
}
