//The printStackTrace(PrintWriter s) method of java.lang.Throwable class is used to print the Throwable
//along with other details like class name, line number where the exception occurred to the specified Print Writer
//This method works the same as printStackTrace() but difference is that it only prints  to the
//specified PrintWriter passed as a parameter
//Syntax: public void printStackTrace(PrintWriter s);
//The method accepts a PrintWriter s as a parameter  which is the specified print writer where these
//Throwable details are to be written
//This method does not return anything
package ExceptionHandling;
import java.io.*;
class ExceptionPrintStackTracePrintWriter {
    //main Method
    public static void main(String[]args) throws Exception{
        try {
            //divide two numbers
            int a = 74, b = 0;
            int c = a / b;

        }
         catch (Throwable e){
            //Using a StringWriter to convert a Trace to a String
             StringWriter sw = new StringWriter();

             //create a PrintWriter
             PrintWriter pw = new PrintWriter(sw);
             e.printStackTrace(pw);

             String error = sw.toString();
             System.out.println("Error:\n: " + error);
         }
    }
}
