//printStackTrace(PrintStream s)
//The method of java.lang.Throwable  class is used to print this Throwable along with other details
//like class name and line number where the exception occurred to the specified print Stream
//This method works the same as printStackTrace() method but the difference is only that it prints
//to specified print stream passed as a parameter

//syntax
//public void printStackTrace(PrintStream s)
//This method accepts PrintStream s as a Parameter which is a specified print stream where to write this Throwable Details
//This method does not return anything




package ExceptionHandling;
import java.io.*;
class ExceptionPrintStackTrace {
    //Main Method
    public static void main(String[]args) throws Exception{
        try {
            //Create an Array of Integers
            int[] i = new int[2];
            //try to add numbers to the array
            i[2] = 3;
        }
        catch (Throwable e){
            //print stack trace
            e.printStackTrace(System.out);
        }
    }
}
