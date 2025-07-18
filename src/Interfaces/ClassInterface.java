package Interfaces;
import java.util.*;

class Parent {
    //Nested Inheritance
    interface Test{
         void show();
    }
}

//Child Class
class Child implements Parent.Test{
    public void show(){
        System.out.println("show method of interface");
    }
}

class Main{
    public static void main(String[]args){
        //Instance of Parent class with Nested Interface
        Parent.Test object;

        //Instance of child class
        Child t = new Child();

        object = t;
        object.show();


    }
}
//The access specifier of the nested interface is package-private(default) since no access-modifier
//is specified
//We can also assign public, protected and private access modifiers to nested interfaces inside a class