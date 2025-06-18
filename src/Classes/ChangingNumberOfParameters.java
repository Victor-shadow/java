package Classes;
import java.io.*;

//Helper class
//MethodOverloading by changing Number of Parameters
class Product{
    //Method1= Multiply two integer values
    public int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    //Method2=Multiply three integer values
    public int multiply(int a, int b, int c){
        int product = a * b * c;
        return product;
    }
}
//Main Class
class ChangingNumberOfParameters {
    public static void main(String[]args){
        //Create object of the class inside main method
        Product object = new Product();
        //Call method to multiply two numbers
        int product1 = object.multiply(200, 300);
        //Print product of two numbers
        System.out.println("The Product of two numbers is: " + product1);

        //Invoke method to multiply 3 numbers
        int product2 = object.multiply(1000, 2000, 3000);
        //Print product of three numbers
        System.out.println("The Product of three numbers is: " + product2);
    }



}
