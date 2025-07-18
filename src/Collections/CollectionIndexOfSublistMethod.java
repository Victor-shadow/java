package Collections;
//The indexOfSublist()Method of java.util.Collections class is used to return the starting position of the
//first occurrence of the specified target list within the specified source list or -1 if there is no occurrence
//More formally returns the lowest index i such that source.subList(i, i+target.size()).equals(target), or -1 if
//there is no such index. Returns -1 if target.size() > source.size()
//This implementation uses the brute force technique of scanning over the source list, looking for a match
//with the target at each location in turn

//Syntax:
//public static int indexOfSubList(List source, List target);
//This method takes the following argument as a parameter:
//source - the list in which to search the first occurrence of the target

//target - the list to search for as a subList of source

//Return value: This method returns the starting position of the first occurrence of the specified target list
//within the specified source list or -1 if there is no occurrence
import java.nio.channels.ScatteringByteChannel;
import java.util.*;


public class CollectionIndexOfSublistMethod {
   public static void main(String[]argv) throws Exception{
       try{
           //Creation of an object of List<String>
           List<String> arraylistSource = new ArrayList<String >();
           List<String> arrayListTarget = new ArrayList<String >();
           //Adding elements to arrayListSource
           arraylistSource.add("A");
           arraylistSource.add("B");
           arraylistSource.add("C");
           arraylistSource.add("D");
           arraylistSource.add("E");
           //Adding elements to arrayListTarget
           arrayListTarget.add("F");
           arrayListTarget.add("G");
           arrayListTarget.add("H");
           //Print source list
           System.out.println("Source list: " + arraylistSource);
           //Print Target List
           System.out.println("Target list: " + arrayListTarget);
           //Check target list in source list
           int index = Collections.indexOfSubList(arraylistSource, arrayListTarget);
           //Print index
           System.out.println("Index of Target List starts at: " + index);
           //Catch exception
       }
       catch (IllegalArgumentException e){
           System.out.println("Exception thrown: " + e);
       }
   }
}
