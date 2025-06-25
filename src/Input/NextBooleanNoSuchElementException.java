package Input;
import java.util.*;

public class NextBooleanNoSuchElementException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "Name";
            //Create a new scanner that uses string as object
            Scanner scanner = new Scanner(s);
            //Obtain the next Boolean value more times than the scanner hence
            //an Exception is thrown
            for(int i = 0; i < 5; i++){
                //If next is a boolean print found  and the boolean
                if(scanner.nextBoolean()){
                    System.out.println("Found Boolean value: " + scanner.nextBoolean());
                }
                //If no boolean is found print NotFound and the token
                else {
                    System.out.println("Not found boolean value " + scanner.next());
                }
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
