package Interfaces;
import java.util.*;

// Correct class name and Comparable implementation
class SortingPairs implements Comparable<SortingPairs> {
    String f; // First value
    String l; // Second value

    public SortingPairs(String f, String l){
        this.f = f;
        this.l = l;
    }

    @Override
    public String toString(){
        return "(" + f + ", " + l + ")";
    }

    @Override
    public int compareTo(SortingPairs p){
        if (this.f.compareTo(p.f) != 0){
            return this.f.compareTo(p.f);
        }
        return this.l.compareTo(p.l); // Compare last if first is equal
    }

    public static void main(String[] args){
        SortingPairs[] p = {
                new SortingPairs("String", "Boolean"),
                new SortingPairs("Integers", "Float"),
                new SortingPairs("Double", "Array")
        };

        System.out.println("Before Sorting:");
        for (SortingPairs p1 : p){
            System.out.println(p1);
        }

        Arrays.sort(p);

        System.out.println("\nAfter Sorting:");
        for (SortingPairs p1 : p){
            System.out.println(p1);
        }
    }
}