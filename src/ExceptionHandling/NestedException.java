package ExceptionHandling;

public class NestedException {
    public static void main(String[]args){
        try {
            //Code that might throw Exception
            int[] n = new int[5];
            int divisor = 0;
            for (int i = 0; i < n.length; i++){
                int res = n[i] / divisor;
                System.out.println(res);
            }
        }
        catch (ArithmeticException e){
            //Create a new Exception with the original
            //as the cause
            throw new RuntimeException("Error:  Division by zero occurred", e);
        }
    }
}
//An array of integers is created and sets the divisor to 0
//Inside the try block, it tries to divide each element of the array by 0, which throws an
//Arithmetic Exception
//This ArithmeticException is caught in the catch block, where a new RuntimeException is created
//with the original exception 'i.e' ArithmeticException as its cause
//Since the RuntimeException is not caught, which displays the stack trace, including the RuntimeException and the
//ArithmeticException