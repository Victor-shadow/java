package Collections;
import java.util.*;
//The copy() method of java.util.Collections class is used to copy all  the elements from one list to another
//After the operation, the index of each copied element in the destination list will be identical to its index
//in the source list
//The destination list must be at least as long as the source list.
//if it is longer, the remaining elements in the destination list are unaffected
//This method runs in linear time
//Syntax:
//public static void copy(List dest, List src)
//Parameters: This method takes the following arguments:
//dest= destination list
//src = source list
//This method throws: indexOutOfBoundsException, if the destination list is too small to contain the entire source list



public class CollectionsCopyMethod {
    public static void main(String[]args) throws Exception{
        try{
            //create object of source list and destination list
            List<String> sourcelist = new ArrayList<String>(3);
            List<String> destinationList = new ArrayList<String>(3);

            //Adding elements to sourcelist
            sourcelist.add("Russia");
            sourcelist.add("Guinea");
            sourcelist.add("Vietnam");

            //Adding elements to destination list
            destinationList.add("1");
            destinationList.add("2");
            destinationList.add("3");
            //printing source list
            System.out.println("Value of source list: " +sourcelist);
            //printing destination list
            System.out.println("Value of destination list: " + destinationList);
            //After Copying
            System.out.println("\nAfter Copying:\n");
            //copy elements into destinationList
            Collections.copy(destinationList, sourcelist);
            //printing source list
            System.out.println("Value of Source list: " + sourcelist );
            //printing destination list
            System.out.println("Value of destination list: " + destinationList);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }


    }
}
