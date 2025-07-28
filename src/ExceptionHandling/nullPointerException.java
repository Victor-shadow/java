package ExceptionHandling;
import java.io.*;
class nullPointerException {
    public static void main(String[]args){
        //Initialize String variable with null value
        String s = null;
        //Check if s is null using try-catch block
        try {
            if ("NullPointerException".equals(s)){
                System.out.println("Same");
            }
            else{
                System.out.println("Not Same");
            }
        }
        catch (NullPointerException e){
            System.out.println("Caught NullPointerException");
        }
    }

}
//always invoke equals on the literal to avoid calling a method on a null reference