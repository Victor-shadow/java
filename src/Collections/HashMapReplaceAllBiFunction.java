package Collections;
import java.util.*;
public class HashMapReplaceAllBiFunction {
    //main method
    public static void main(String[]args){
        //Create a HashMap to record year of Birth
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 1991);
        hashMap.put("Kotlin", 2011);
        hashMap.put("Flask", 2010);
        hashMap.put("Rust", 2008);

        //print map details
        System.out.println("HashMap: " + hashMap.toString());
        //replace year of birth with current age use replaceAll() method
        hashMap.replaceAll((key, yearOfBirth) -> 2011 - yearOfBirth);
        //print new Mapping
        System.out.println("New HashMap: " + hashMap);


    }
}
