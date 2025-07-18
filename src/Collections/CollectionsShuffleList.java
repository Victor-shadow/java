//shuffle a given list given user-provided source of randomness
//Here an additional parameter that is provided which above is "random" is the source of randomness to shuffle the lsit
//Syntax:
//public static void shuffle(List mylist, Random random)
//parameters:
//List
//Source of Randomness
//Exception:UnsupportedOperation Exception if the specified list or its list-iterator does not support set operation

package Collections;
import java.util.*;
public class CollectionsShuffleList {
  public static void main(String[]args){
      //Create an Empty ArrayList
      ArrayList<String> array = new ArrayList<String>();
      //Add custom input elements
      array.add("name");
      array.add("Age");
      array.add("Height");
      array.add("Weight");
      array.add("Gender");
      //print and display elements on the console
      System.out.println("Original List: \n" + array);
      //Shuffle the list using Random(3)
      Collections.shuffle(array, new Random(3));
      //print updated list
      System.out.println("\nShuffled List with Random(3) : \n" + array);
      //Shuffle the list using  new Random(3)
      Collections.shuffle(array, new Random(5));
      System.out.println("\nShuffledList with Random(5): \n" + array);



  }
}
