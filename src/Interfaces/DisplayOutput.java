package Interfaces;

interface PrivateMethods {
    //Private methods for internal Use
    private void implementInterface(){
        System.out.println("This is a private method in an interface");
    }
    //Default method that uses the private method
    default void display(){
        implementInterface();
        System.out.println("The Default method implements the private method");
    }
}

class Implement implements PrivateMethods{
    //Inherits the default method
}
public class DisplayOutput{
    public static void main(String[]args){
        Implement object = new Implement();
        //This will invoke the default method which calls the private method
        object.display();
    }
}
