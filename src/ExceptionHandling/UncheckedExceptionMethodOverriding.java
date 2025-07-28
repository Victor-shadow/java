package ExceptionHandling;

class SuperClass{
    void method(){
        System.out.println("Superclass method Executed");
    }
}
//subclass declares an unchecked exception
class SubClass extends SuperClass{
    @Override
    void method() throws ArithmeticException{
        System.out.println("Subclass method executed");
        throw  new ArithmeticException("Exception in Subclass");
    }
    public static void main(String[]args){
        SuperClass object = new SubClass();
        try {
            object.method();
        }
        catch (ArithmeticException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }

    }

}
public class UncheckedExceptionMethodOverriding {

}
//the SuperClass method does not declare any exceptions
//The SubClass method overrides the method() and declares an unchecked exception 'i.e'  ArithmeticException
//The main method demonstrates how the exception is thrown and caught in the subclass
