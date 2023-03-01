package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!!");
        System.out.println("Hello Java");

        //Declare the variable
        int FirstVariable;
        //Initialize the variable
        FirstVariable=5;
        System.out.println("First variable is :"+FirstVariable);
        int SecondVariable=30;
        int total = FirstVariable + SecondVariable;
        System.out.println("Total is "+total);
        /* Primitive data types: Integer, Floating point numbers, character and boolean

        INTEGERS
        byte, short, int, long

        DOUBLE
        double, float

        CHARACTER
        char

        BOOLEAN
        boolean
         */
        //8 bit or 1 byte
        byte minByte=-128;
        byte maxByte=127;

        //16 bit or 2 bytes
        short minShort=--32_768;
        short maxShort=32_767;

        //32 bit or 4 bytes
        int minInt=-2_147_483_648;
        int maxInt=2_147_483_647;

        //64 bit or 8 bytes
        long minLong=-9_223_372_036_854_775_808;
        long maxLong=9_223_372_036_854_775_807;
    }

}