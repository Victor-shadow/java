package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//The addAll() method of java.util.Collections class is used to add all the specified elements
//to the specified collection. Elements to be added may be specified individually or as an array

class AddingCollectionElements {
    public static void main(String[]args){
        List<String> array = new ArrayList<>();
        //Add elements to the List
        array.add("Shoes");
        array.add("Socks");
        //Add One More Element
        Collections.addAll(array, "Trouser", "Shirt", "Underwear");
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i) + " ");
        }
    }
}
