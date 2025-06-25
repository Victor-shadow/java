package Input;
import java.util.*;

public class FloatMethod {
    public static void main(String[]argv) throws Exception{
        String s = "Name 9.0 + 6 = 12.0";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()){
            if (scanner.hasNextFloat()){
                System.out.println("Float Value found at: " + scanner.nextFloat());
            }
            else{
                System.out.println("Not Found Float() value: " + scanner.next());
            }
        }
        scanner.close();
    }
}
