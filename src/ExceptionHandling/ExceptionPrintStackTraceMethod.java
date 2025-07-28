//printStackTrace() method of java.lang.Throwable class is used to print this Throwable along with the other details like
//class name and line number where the exception occurred means its backtrace
//This method prints a stack trace for this Throwable object on the standard error output stream
//The first line of output shows the same string which was returned by the toString() method
//for this object means Exception class name and later lines represents  data previously recorded by the
//method fillInStackTrace()

//syntax
//public void printStackTrace()

//This method does not return anything
//



package ExceptionHandling;
import java.io.*;
class ExceptionPrintStackTraceMethod {
    //Main Method
    public static void main(String[]args) throws Exception{
        try {
            testException1();
        }
        catch (Throwable e){
            //print stack trace
            e.printStackTrace();
        }
    }
    //Method which throws Exception
    public static void testException1() throws Exception{
        //Create ArrayIndexOutOfBoundsException
        ArrayIndexOutOfBoundsException ae = new ArrayIndexOutOfBoundsException();
        //Create a new Exception
        Exception ioe = new Exception();
        //Initialize the cause and throw the exception
      ioe.initCause(ae);
      throw ioe;
    }

}
