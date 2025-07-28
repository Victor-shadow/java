package ExceptionHandling;
import java.io.*;

class arithmeticException{
    public static void main(String[]args){
        try {
            //This will throw Arithmetic Exception
            int res = 10 / 0;
        }
        //Handle the exception
        catch (ArithmeticException e){
            System.out.println("Exception caught: " + e);
        }
        //This line executes whether the exception occurs or not
        System.out.println("I will always execute");
    }
}