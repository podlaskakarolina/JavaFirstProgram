package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!!");
        System.out.println("Hello Java");

        //Declare the variable
        int FirstVariable;
        //Initialize the variable
        FirstVariable=5;
        System.out.println("First variable is :"+FirstVariable);
        int SecondVariable=-130;
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
        short minShort=-32_768;
        short maxShort=32_767;

        //32 bit or 4 bytes
        int minInt=-2_147_483_648;
        int maxInt=2_147_483_647;

        //64 bit or 8 bytes
        long minLong=-9_223_372_036_854_775_808L;
        long maxLong=9_223_372_036_854_775_807L;
        //********************************************************

        //32 bit or 4 bytes
        int myInt=10 / 3;
        System.out.println("My int is "+myInt);

        //32 bit or 4 bytes
        float myFloat= (float) 10.25F / 3f; //need to by Fin Lne - by default every floating number is double
        System.out.println("My float is "+myFloat);

        //64 bit or 8 bytes
        double myDouble=10.25 /3d;
        System.out.println("My double is "+myDouble);

        //1 bit boolean
        boolean myBoolean = true;
        System.out.println("My boolean is"+myBoolean);

        /*TYPES OF JAVA OPERATORS
        Arithmetic operators
        + - * / & ++ --

        Relational operators
        == != < > <= =>

        Logical operators
        && || !

        Assignment operators
        = += -= *= /= %=

        Conditional operators
        ?:

         */
        int a=8, b=2, c=4;
        System.out.println("a =" + a + ", b = "+b);
        System.out.println("a + b ="+ (a+b));
        System.out.println("a - b ="+ (a-b));
        System.out.println("a * b ="+ (a*b));
        System.out.println("a / b ="+ (a/b));
        System.out.println("a & b ="+ (a&b));
        //a++ is an equivalence of a = a + 1
        System.out.println("print a "+a);
        System.out.println("a++ ="+ a++ + " doesn't work");
        System.out.println("a++ ="+ a + " does");
        System.out.println("a-- ="+ (a--));
        /* METODY
        <typ zwracany> <nazwa metody>(<opcjonalna lista argumentów>) {
        <ciało metody>
        boolean isBig(int someNumber) {
        return someNumber > 100;
        }
        */
        int temperature = -12;
        int height = 186;
        int distance = 2589;
        int numberOfErrors = 0;
        //String przechowuje łańcuchy znaków
        String name = "Marcin";
        String weekday = "Monday";
        String someSentence = "Samouczek Programisty jest git ;)";
        }
        /*Metoda może zwracać jakąś wartość. Do zwrócenia wartości z metody służy słowo kluczowe return.
        Na przykład metoda niżej nie pobiera żadnych argumentów i zwraca łańcuch znaków:

        String getName() {
            return "Marcin";
        }

        Metoda może także nie zwracać żadnej wartości, wówczas używa się słowa kluczowego void do
        określenia typu zwracanej wartości. Na przykład metoda poniżej nie przyjmuje żadnych argumentów i
        nie zwraca żadnej wartości:

        void printSomething() {
        System.out.println("Something");
        }
        ! W języku Java nie jest możliwe zwracanie wielu wartości.
        Metoda może nie zwrócić nic (void) lub pojedynczą wartość.

        DEFINICJA METODY A JEJ WYWOŁANIE

         */
        boolean isBig(int someNumber) {
            return someNumber > 100;
        } //To jest definicja

        boolean someVariable = isBig(10); //to jest wywołanie metody isBig


    }

