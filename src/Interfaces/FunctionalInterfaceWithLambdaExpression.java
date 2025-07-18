package Interfaces;

public class FunctionalInterfaceWithLambdaExpression {
    public static void main(String[]args){
        //Using Lambda expression to implement runnable
        new Thread(() -> System.out.println("New Thread started:")).start();
    }

}
//The lambda function is used to implement the Runnable Functional Interface and create a new thread
