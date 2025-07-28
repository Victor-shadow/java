package ExceptionHandling;
import java.io.*;
class SuperClassMainException {
    //Superclass declares an Exception
    void method() throws RuntimeException{
        System.out.println("Superclass");
    }
}

//Superclass inherited by subclass
class SubClassChildException extends SuperClassMainException{
    //subclass declares a child Exception
    //to Runtime Exception
   void method() throws ArithmeticException{
       //ArithmeticException is a child Exception to RunTime Exception
       //so the compiler won't give an error
       System.out.println("Subclass");
   }
   public static void main(String[]args){
       SuperClassMainException s = new SubClassChildException();
       s.method();
   }
}
