package Collections;
import java.util.*;
//The java.util.Collection.disjoint() method is present in java.util.Collection class
//It is used to check whether two specified collections are disjoint or not
//Two collections are disjoint, if they have no elements in common

//Syntax:
//public static boolean disjoint(Collection<?> c1, Collection<?> c2)
//Parameters:
//c1 = a collection
//c2 = a collection
//Returns:
//true if two specified collections have no elements in common
//Exception:
//NullPointerException= if either collection is null
//If one collection contains a null element and null is not eligible element for the other collection
//ClassCastException = if one collection contains an element that is of a type which is ineligible
//for the other collection

//NOTE: It is permissible to pass the same collection in both parameters, in which case the method will return true,
//if and only if the collection is empty

public class CollectionsDisjointMethod {
    public static void main(String[]args){
        //AN ARRAY LIST OF STRINGS
        List<String> mylist = new ArrayList<String>();
        mylist.add("Software Engineer");
        mylist.add("Data Scientist");
        mylist.add("Cyber security");
        mylist.add("Data Engineer");
        //A Vector of Strings
        List<String> mylist2 = new ArrayList<String>();
        mylist2.add("Kotlin");
        mylist2.add("Java");
        mylist2.add("Go");
        mylist2.add("Rust");
        //Create a vector
        List mylist3 = new Vector();
        mylist3.add("Python");
        mylist3.add(3);
        //Create a set of strings
        Set<String> mylist4 = new HashSet<String>();
        mylist4.add("circle");
        mylist4.add("rectangle");
        mylist4.add("square");
        mylist4.add("oval");
        //Use of disjoint method to check if two collections are disjoint or not
        System.out.println("is mylist1 disjoint to mylist2: " + Collections.disjoint(mylist, mylist2));
        System.out.println("is mylist1 disjoint to mylist3: " + Collections.disjoint(mylist, mylist3));
        System.out.println("is mylist1 disjoint to mylist4: " + Collections.disjoint(mylist, mylist4));
    }
}
