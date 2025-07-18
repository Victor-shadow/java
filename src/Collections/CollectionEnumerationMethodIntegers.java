package Collections;

import java.util.*;

public class CollectionEnumerationMethodIntegers {
    public static void main(String[] argv) throws Exception {
        try {
            // 🎯 Step 1: Create a List of Integers
            List<Integer> arrayList = new ArrayList<>();

            // ➕ Step 2: Add elements to the list
            arrayList.add(100);
            arrayList.add(200);
            arrayList.add(300);

            // 🖨️ Step 3: Print the list
            System.out.println("Source List: " + arrayList);

            // 🔁 Step 4: Create an Enumeration from the list
            Enumeration<Integer> e = Collections.enumeration(arrayList);

            // 🖨️ Step 5: Iterate and print using Enumeration
            System.out.println("\nEnumeration over list:");
            while (e.hasMoreElements()) {
                System.out.println("Value is: " + e.nextElement());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown: " + e);
        } catch (NoSuchElementException e) {
            System.out.println("Exception thrown: " + e);
        }
    }
}