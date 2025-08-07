package ControlFlow;
import java.io.*;
class ReturnKeyword {
    //a simple method that takes two integers as input
    //and returns their sum
    public static int calculateSum(int num1, int num2){
        //print message to indicate the method has started
        System.out.println("Calculating the sum of " + num1 + "and " + num2);
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        //return the calculated sum
        return sum;
        //Note : Any code after the return statement will not be executed
        //But Final is an exception in the case of a 'try-catch-finally' block
    }
    public static void main(String[]args){
        //invoke calculateSum method
        int result = calculateSum(500, 600);
        //print the results
        System.out.println("Result: " + result);
    }
}
//When we are calling a class calculateSum method that has return sum
//which returns the value of sum and that value gets displayed on the console
