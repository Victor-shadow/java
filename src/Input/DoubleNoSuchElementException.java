package Input;
import java.util.*;


public class DoubleNoSuchElementException {
    public static void main(String[]argv) throws Exception{
        try{
            String s ="name";
            Scanner scanner = new Scanner(s);

            for (int i = 0; i < 5; i++){
                if (scanner.hasNextDouble()){
                    System.out.println("Found Double Value: " + scanner.nextDouble());
                }
                else {
                    System.out.println("Not found Double Values: " + scanner.next());
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }
    }


}
