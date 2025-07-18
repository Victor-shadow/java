package Interfaces;
import java.util.*;

class ComparableInterface implements Comparable<ComparableInterface> {
    int v; // Value

    public ComparableInterface(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return String.valueOf(v);
    }

    @Override
    public int compareTo(ComparableInterface other) {
        return this.v - other.v;  // Ascending
    }

    public static void main(String[] args) {
        // Create an array of ComparableInterface objects
        ComparableInterface[] n = {
                new ComparableInterface(4),
                new ComparableInterface(1),
                new ComparableInterface(7),
                new ComparableInterface(2)
        };

        System.out.println("Before Sorting: " + Arrays.toString(n));

        Arrays.sort(n);  // Works because Comparable is correctly implemented

        System.out.println("After Sorting: " + Arrays.toString(n));
    }
}
//The compareTo() method is overridden to define the ascending order logic by comparing the v fields of Number Objects
