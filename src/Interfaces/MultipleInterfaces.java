package Interfaces;
import java.io.*;

//Add Interface
interface Add{
    int add(int a, int b);
}
//Subtract Interface
interface Subtract{
    int subtract(int a, int b);
}
//Calculator class implementing interfaces
class Calculator implements  Add, Subtract{
    //Method to add two numbers
    public int add(int a, int b){
        return a + b;
    }
    public  int subtract(int a, int b ){
        return a - b;
    }
}
class MultipleInterfaces {
    //Main Method
    public static void main(String[]args){
        //Object of calculator class
        Calculator object = new Calculator();
        System.out.println("Addition " + object.add(200, 300));
        System.out.println("Subtraction: " + object.subtract(1000, 900));
    }

}

