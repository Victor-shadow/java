package ExceptionHandling;
import java.io.*;
class ExceptionPrintStackTracePrintStream {
    public static void main(String[]args) throws Exception{
        try {
            testException1();
        }
        catch (Throwable e){
            //create print stream object
            PrintStream obj = new PrintStream(System.out);
            //print stack trace
            e.printStackTrace();
        }
    }
    //Method which throws Exception
    public static void testException1() throws Exception{
        throw new Exception("System is Down");

    }
}
