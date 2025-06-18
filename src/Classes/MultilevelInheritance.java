package Classes;
import java.io.*;
import java.lang.*;
import java.util.*;

//Parent Class
class ParentName{
    //Method to print Output
    public void print_output(){
        System.out.println("Multilevel Inheritance");

    }
}

//Child Class Inherits from parent class
class ChildOne extends ParentName{
    //Method to print
    public void print_for(){
        System.out.println("for");
    }
}
//Child Class 2 inherits from ChildOne class
class ChildTwo extends ChildOne{
    //Method to print output
    public void print_final(){
        System.out.println("The derived class is also a parent to another subclass");
    }
}
public class MultilevelInheritance {
    public static void main(String[]args){
        //Create an object of class Three
        ChildTwo object = new ChildTwo();
        //Call method from class One
        object.print_output();
        //Call method from class TWO
        object.print_for();
        //Call method from class Three
        object.print_final();
    }
}
