package ExceptionHandling;
import java.util.*;
public class MultipleCatchBlock {
    public static void main(String[]args){
        try {
            //Arithmetic Exception
            int res = 10 / 0;
            //NullPointerException
            String s  = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println("Caught Arithmetic Exception: " + e);
        }
        catch (NullPointerException e){
            System.out.println("Caught NullPointerException: " + e);
        }
    }

}
