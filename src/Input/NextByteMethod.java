package Input;
import java.util.*;


public class NextByteMethod {
    public static void main(String[]argv) throws Exception{
        String s = "Name 9 + 6= 12.0";
        //Create a new scanner object for string
        Scanner scanner = new Scanner(s);

        while(scanner.hasNext()){
            //if next is a byte print byte found
            if(scanner.hasNextByte()){
                System.out.println("Found Byte value: " + scanner.nextByte());
            }
            //If Byte not found print the Byte has not been found
            else{
                System.out.println("Not found byte value: " + scanner.next());
            }
        }
        scanner.close();

    }

}
