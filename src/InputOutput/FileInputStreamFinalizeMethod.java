//java.io.FileInputStream.finalize() method is part of java.io.FileInputStream class
//it ensures that the close method of the FileInputStream is called whenever there are no more references
//of fileInputStream that exists

//finalize method is annotated; @Deprecated
//finalize() method is used to perform a cleanup act where no more references exist
//finalize method might throw IOException
//finalize() method is protected, which means different packages subclasses cannot access them
//FileInputStream.finalize() is available in java.io.*; package

//Syntax
//protected void finalize() throws IOException
//Return value: The finalize() method has  a void return type 'i.e' does not return anything;
//Exception: finalize() method might throw IOException if any input/output exception raises\

//invoke finalize() method
//create a class that extends  FileInputStream and passes on FileName to its parent class
//public class Finalize extends FileInputStream{
//public Finalize(){
//super(fileName);
//}
//}

//Step 2: Create an instance of the class
//Finalize finalize = new Finalize();
//Step 3: Invoke finalize method
//finalize.finalize();

// Java Program to illustrate the use of the
// Java.io.FileInputStream.finalize() method
package InputOutput;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamFinalizeMethod extends FileInputStream {
    // parameterized constructor
    public FileInputStreamFinalizeMethod(String fileName) throws Exception
    {
        super(fileName);
    }

    public static void main(String[] args)
    {
        try {
            // create instance of GFG class that
            // extends FileInputStream.
            // user should change name of the file
            FileInputStreamFinalizeMethod f = new FileInputStreamFinalizeMethod("C://Users//victo//Java//java.txt");

            // reading bytes from file
            System.out.println(
                    "Content read from the file before finalize method is called :");

            for (int i = 0; i <= 13; i++)
                System.out.print((char)f.read());

            // finalize() method is called.
            // method will perform the cleanup act
            // if no reference is available
            f.finalize();

            // reading bytes again from file
            System.out.println(
                    "Content read from the file after finalize method is called :");

            for (int i = 13; i < 47; i++)
                System.out.print((char)f.read());
        }
        catch (Throwable t) {
            System.out.println("Some exception");
        }
    }
}