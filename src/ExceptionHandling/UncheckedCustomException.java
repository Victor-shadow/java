package ExceptionHandling;

class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String m){
        super(m);
    }
}
//Using the Custom Exception
public class UncheckedCustomException {
    public static void divide(int a, int b){
        if (b == 0){
            throw new DivideByZeroException("Division by zero is not allowed");
        }
        System.out.println("Result: " + (a / b));
    }
    public static void main(String[]args){
        try {
            divide(10, 0);
        }catch (DivideByZeroException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

}
//the divide method checks if the denominator is zero and throws the exception if it is true
//In the main() method the exception is caught and the error message is printed