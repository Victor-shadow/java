package ExceptionHandling;

public class ExceptionFinallyKeyword {
    public static void main(String[]args){
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; //cause an Exception
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Final block always executes");
        }

    }
}

//the try block attempts a division by zero, causes an Arithmetic Exception
//The finally block executes, whether an exception occurs, ensures cleanup and mandatory code execution
