package Input;
import java.util.*;

public class DoubleIllegalStateException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "Name 9.0 + 6.0 = 15.0";

            Scanner scanner = new Scanner(s);

            scanner.close();
            System.out.println("Scanner closed.");

            System.out.println(" Trying to Get: " + " next Double value");

            while (scanner.hasNext()){
                if (scanner.hasNextDouble()){
                    System.out.println("Found Double value at: " + scanner.nextDouble());
                }
                else {
                    System.out.println("Not found Double Value: " + scanner.next());
                }
            }
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
