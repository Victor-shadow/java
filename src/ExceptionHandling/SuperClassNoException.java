package ExceptionHandling;
import java.io.*;
class SuperClassNoException {
    //super class does not declare any exception
    void method(){
        System.out.println("SuperClass");
    }
}

class SubClassException extends SuperClassNoException{
    //method() declaring UncheckedException ArithmeticException
    void method() throws ArithmeticException{
        //ArithmeticException is of type UncheckedException
        //so no error by compiler
        System.out.println("Subclass");
    }
    public static void main(String[]args){
        SuperClassNoException s = new SubClassException();
        s.method();
    }

}
