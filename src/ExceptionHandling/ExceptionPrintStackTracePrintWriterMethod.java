package ExceptionHandling;
import java.io.*;
class ExceptionPrintStackTracePrintWriterMethod {
    //Main Method
    public static void main(String[]args) throws Exception{
        try {
            testException1();
        }
        catch (Throwable e){
            StringWriter sw = new StringWriter();
            //Create a PrintWriter
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);

            String error = sw.toString();
            System.out.println("Error:\n" + error);
        }
    }
    //Method which throws Exception
    public static void testException1() throws Exception{
        throw  new Exception("Waiting but no response");

    }
}
