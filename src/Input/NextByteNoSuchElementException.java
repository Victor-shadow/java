package Input;
import java.util.*;
public class NextByteNoSuchElementException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "Name";

            Scanner scanner = new Scanner(s);

            for(int i = 0; i < 5; i++){
                if(scanner.hasNextByte()){
                    System.out.println("Found byte value at: " + scanner.nextByte());
                }
                else {
                    System.out.println("Not found byte value: " + scanner.next());
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }


    }
}
