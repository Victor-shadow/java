package ControlFlow;

public class IfElse {
    public static void main(String[]args){
        int n = 10;
        if (n > 5){
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is 5 or less");
        }
    }
}
//program starts
//n is initialized to 10
//if condition is checked: 10 > 5 yields true,
//Block inside the if statement is executed "The number is greater than 5" is printed
//the else block is skipped as the condition is true