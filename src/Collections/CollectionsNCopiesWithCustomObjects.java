package Collections;
import java.util.*;

class CollectionsItems {
    String name;
    //Constructor
    CollectionsItems(String name){
        this.name=name;
    }
    //toString method for printing
    public String toString(){
        return name;
    }
}
public class CollectionsNCopiesWithCustomObjects{
    public static void main(String[]args){
        //Create a custom object
        CollectionsItems object = new CollectionsItems("Java Basics");
        //Create 5 copies of the custom object
        List<CollectionsItems> bookList =Collections.nCopies(5, object);
        System.out.println("Book ObJects: ");
        for (CollectionsItems c: bookList){
        System.out.println(c);
        }


    }
}
