package ExceptionHandling;

public class ChainedException {
    public static void main(String[]args){
        try {
            //Creating an Exception
            NumberFormatException ex = new NumberFormatException("Primary Exception");
            //set the cause of the Exception
            ex.initCause(new NullPointerException("Root cause of the Exception"));
            //Throwing the exception with a cause
            throw  ex;
        }
        catch (NumberFormatException e){
            //Display the primary Exception
            System.out.println("Caught Exception: " + e);
            //Display the root cause of the Exception
            System.out.println("Cause of Exception: " + e.getCause());
        }
    }
}
