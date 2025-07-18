package Input;
import java.util.*;

public class NextIntNoSuchElementException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "string";
            Scanner scanner = new Scanner(s);

            for (int i = 0; i < 5; i++){
                if (scanner.hasNextInt()){
                    System.out.println("Found Int Value: " + scanner.nextInt());
                }
                else{
                    System.out.println("Not Found Int Value: " + scanner.next());
                }
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
