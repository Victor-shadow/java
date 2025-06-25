package Input;
import java.util.*;

public class NextDoubleMethod {
    public static void main(String[]argv) throws Exception{
        String s = "Name 9 + 6.0 = 15";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()){
            if(scanner.hasNextDouble()){
                System.out.println("Found a Double Value: " + scanner.nextDouble());
            }
            else{
                System.out.println("Not found double() value: " + scanner.next());
            }
        }
        scanner.close();
    }


}
