package Collections;
import java.util.*;

public class CollectionsCopyMethodIndexOutOfBoundsException {
    public static void main(String[]argv) throws Exception{
        try{
            List<String> sourcelist = new ArrayList<String>(3);
            List<String> destinatinList = new ArrayList<String>(2);
            //Adding elements to sourceList
            sourcelist.add("R");
            sourcelist.add("Go");
            sourcelist.add("Carbon");
            //Adding elements to destination List
            destinatinList.add("1");
            destinatinList.add("2");

            //print sourceList
            System.out.println("Value of Source List: " + sourcelist);
            System.out.println("Value of Destination List: " + destinatinList);
            System.out.println("\nAfter Copying:\n");
            //copy elements to destinationList
            Collections.copy(destinatinList, sourcelist);
            //printing source list
            System.out.println("Value of Source List: " + sourcelist);
            //print destinationList
            System.out.println("Value of Destination List: " + destinatinList);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}

