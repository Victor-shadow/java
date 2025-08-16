package Collections;
import java.util.*;
class TreeSetStringBufferClass {
    public static void main(String[]args){
        //Create a TreeSet with a Custom Comparator
        Set<StringBuffer> treeSet = new TreeSet<>(new Comparator<StringBuffer>() {
            @Override
            public int compare(StringBuffer o1, StringBuffer o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        //add elements to the TreeSet
        treeSet.add(new StringBuffer("Java"));
        treeSet.add(new StringBuffer("Kotlin"));
        treeSet.add(new StringBuffer("C++"));
        treeSet.add(new StringBuffer("C#"));
        treeSet.add(new StringBuffer("Laravel"));
        treeSet.add(new StringBuffer("Scala"));
        //print the elements
        System.out.println(treeSet);

    }

}
//StringBuffer does not implement the Comparator Interface. Therefore, one has to provide the custom
//Comparator to use StringBuffer objects in a TreeSet