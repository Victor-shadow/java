package Collections;
import java.util.*;
//The lastIndexOfSubList() method of Java Collections is used in ArrayList Collection
//An ArrayList is a data structure that can sequentially store data with multiple data types
//Syntax: List<datatype> data = new ArrayList<>(); where:
//datatype = specifies the type of elements stored in the list
//data is the name of the array list

//The lastIndexOfSublist() method is used to get the starting position of the last occurrence of the specified target list
//within the specified sourceList
//Syntax:
//public static int final lastIndexOfSublist(List<?> first, List<?> last)
//where:
//first is the source list,which we search for the last occurrence of the last list
//last is the target list which we search for as a sublist of the first list
//Return type: It will return the starting position of the last occurrence of the specified target list
//within the specified source list. It will return -1 if there is no occurrence in the given list
public class CollectionsLastIndexOfSubList {
    public static void main(String[] args){
        //create the first list
        List<String> data = new ArrayList<>();
        //Add Elements in the first list
        data.add("Python");
        data.add("c/c++");
        data.add("java");
        data.add("html");
        data.add("Css");
        //Create last List
        List<String> list = new ArrayList<>();
        //Add Elements in the last list
        list.add("java");
        list.add("html");
        list.add("css");
        //Check source list in the last list
        System.out.println(Collections.lastIndexOfSubList(data, list));


    }

}
