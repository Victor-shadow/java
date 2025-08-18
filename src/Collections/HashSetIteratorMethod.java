package Collections;
import java.util.*;
public class HashSetIteratorMethod {
    public static void main(String[]args){
        //create a HashSet
        HashSet<Language> hashSet = new HashSet<>();
        hashSet.add(new Language(10, "Java"));
        hashSet.add(new Language(20, "Kotlin"));
        hashSet.add(new Language(30, "C++"));

        //create an Iterator
        Iterator<Language> iterator = hashSet.iterator();

        //iterate through the hash set and print each
        //Language object
        while (iterator.hasNext()){
            System.out.println("Value: " + iterator.next() + " ");
        }
    }
}

class Language{
    int id;
    String name;

    Language(int id, String name){
        this.id = id;
        this.name = name;
    }
    //override the toString() method to provide the String representation of the Object
    @Override
    public String toString(){
        return  "[ " + this.id + ", " + this.name + " ]";
    }
}
