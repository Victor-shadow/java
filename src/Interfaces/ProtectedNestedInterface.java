package Interfaces;
import java.util.*;

class ParentA {
     protected  interface  Test{
         void show();
     }
}

class ChildA implements ParentA.Test{

    public void show(){
        System.out.println("show method interface");
    }
}
//Driver Class
class ProtectedNestedInterface{
    public static void main(String[]args){
        ChildA object;
        ChildA t = new ChildA();
        object = t;
        object.show();
    }

}
//If we change the access specifier to private, it causes a compilation error because the derived Class Child
//tries to access a private interface
