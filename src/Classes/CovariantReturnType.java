package Classes;
//Demonstration of different return Types
// if Return type in Overridden method is Sub-type

import java.security.PublicKey;

//class 1
class First{
}
//Class 2
class Second extends First{
}
//Class 3
//Helper class Base class
class Base{
    //Method of this class of class1 return type
    First function(){
        //Display Message
        System.out.println("Base function()");

        return new First();
    }
}
//Class 4
//Helper class extending above class
class Obtained extends Base{
    //Method of this class of class1 return type
    Second function() {
        //Display message only
        System.out.println("Derived function");

        return new Second();
    }
}
//Main class
public class CovariantReturnType {
    public static void main(String[]args){
        //Creation of object of class3 type
        Base base = new Base();
        //Calling method function() over this object inside main method
        base.function();
        //Creating object of class4 type
        Obtained obtain = new Obtained();
        //Call method function() over this object inside main method
        obtain.function();
    }

}
