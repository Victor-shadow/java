package Input;
import java.util.*;

public class NextBooleanInputMismatchException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "Gfg 9 + 6 = 12.0";

            //Create new scanner with specified string object
            Scanner scanner = new Scanner(s);
            while (scanner.hasNext()){
                //If the next is a Boolean print found and the boolean
                //since value 60 is out of range an exception is thrown
                System.out.println("Next boolean value: " + scanner.nextBoolean());
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception at e: " + e);
        }
    }

}
