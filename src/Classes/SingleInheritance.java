package Classes;
import java.io.*;
import  java.lang.*;
import  java.util.*;

class ParentClass {
    public void print_result(){
        System.out.println("Single Inheritance is when a derived class only inherits from one parent class.");
    }
}
class ChildClass extends ParentClass{
    public void print_for(){
        System.out.println("Implementation of Single Inheritance.");
    }
}
//Driver Class
public class SingleInheritance{
    public static void main(String[]args){
        ChildClass object = new ChildClass();
        object.print_for();
        object.print_result();
    }
}
