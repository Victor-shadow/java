package Input;
import java.util.*;


public class NextDoubleInputMismatchException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "Name 9 + 6.0 = 15.0";

            Scanner scanner = new Scanner(s);
            while (scanner.hasNext()){
                System.out.println("Next Double Value: " + scanner.nextDouble());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }

    }

}
