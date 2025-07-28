package ExceptionHandling;
import java.io.*;
class CheckingMethodArgumentsNullPointerException {
    public static void main(String[] args) {
        //String s set as an empty String
        //and calling getLength
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        //String s set to a value
        //calling getLength()
        s = "NullPointerException";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        //Set String s as null and call getLength()
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception caught");
        }
    }

    //Function to return length of String s
    //It throws IllegalArgumentException if s is null
    public static int getLength(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The argument cannot be null");
        }
        return s.length();
    }
}


