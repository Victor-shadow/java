package Input;
import java.util.*;

public class FloatInputMismatchMethod {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "Name 9 + 6 = 15.0";
            Scanner scanner = new Scanner(s);

            while (scanner.hasNext()){
                System.out.println("Next Float Value: " + scanner.nextFloat());
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }

    }

}
