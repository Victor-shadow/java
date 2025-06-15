package Operators;
import java.io.*;

class ArithmeticOperators {
    public static void main(String[] args){
        //Arithmetic Operations on Integers
        int a = 100;
        int b = 200;

        //Arithmetic operations on Strings
        String n1 = "50";
        String n2 = "100";

        //Convert Strings into Integers
        int a1 = Integer.parseInt(n1);
        int a2 = Integer.parseInt(n2);

        System.out.println("a + b = " + (a +b ));
        System.out.println("a - b = " + (a - b));
        System.out.println(" a * b = " + (a * b));
        System.out.println("a / b = "  + (b / a));
        System.out.println("a % b = " + (a % b));
        System.out.println("a1 + a2 = " + (a1 + a2));
    }

}
