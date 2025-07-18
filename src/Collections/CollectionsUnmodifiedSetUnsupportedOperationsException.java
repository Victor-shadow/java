package Collections;
import java.util.*;
import java.lang.Character;

public class CollectionsUnmodifiedSetUnsupportedOperationsException {
    public static void main(String[]argv) throws Exception{
        try{
            //Create object of HashSet
            Set<Character> set = new HashSet<Character>();
            //populate the set
            set.add('X');
            set.add('Y');
            //Make the set unmodifiable
            System.out.println("Unmodifiable Set: " + set);
            Set<Character> immutableSet = Collections.unmodifiableSet(set);
            //print unmodifiable set
            System.out.println("Unmodifiable set: " + immutableSet);
            System.out.println("\nTrying to modify" + " unmodifiable set ");
            immutableSet.add('A');
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
