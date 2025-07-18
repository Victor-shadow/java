package Collections;

import java.util.HashSet;

public class CollectionsRetainAllMethodHashSet {
    public static void main(String[]args){
        HashSet<String> hashset1 = new HashSet<String>();
        hashset1.add("January");
        hashset1.add("February");
        hashset1.add("March");
        hashset1.add("April");

        HashSet<String> hashset2 = new HashSet<String>();
        hashset2.add("March");
        hashset2.add("April");
        System.out.println("Original HashSet collection: " + hashset1);
        System.out.println("Hashset containing the elements to be retained by the calling collection: " + hashset2);

        boolean modified = hashset1.retainAll(hashset2);
        System.out.println("Calling Collection Modified: " + modified);
        System.out.println("Original Hashset  Collection(Elements Modified): " + hashset1);
    }
}
