package Input;
import java.util.*;

public class NextByteIllegalStateException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "Name 6 + 9 = 15.0";
            Scanner scanner = new Scanner(s);
            scanner.close();
            System.out.println("Scanner closed");

            System.out.println("trying to get next" + " byte value: "  );

            while (scanner.hasNext()){
                if(scanner.hasNextByte()){
                    System.out.println("Found byte value at: " + scanner.nextByte());
                }
                else{
                    System.out.println("Not found byte value: " + scanner.next() );
                }
            }
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }
    }


}
