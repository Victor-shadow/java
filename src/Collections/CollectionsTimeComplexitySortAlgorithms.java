package Collections;
import java.io.*;
import java.util.*;

class CollectionsTimeComplexitySortAlgorithms {
    public static void main(String[] args) {
        int len = 5_000_000;

        // Create a large test array
        int[] arr = new int[len];
        for (int i = len; i > 0; i--) {
            arr[len - i] = i;
        }

        // Create a large test ArrayList
        ArrayList<Integer> list = new ArrayList<>(len);
        for (int i = len; i > 0; i--) {
            list.add(i);
        }

        // Measure Arrays.sort()
        int[] arrCopy = Arrays.copyOf(arr, arr.length); // avoid in-place impact
        long startA = System.currentTimeMillis();
        Arrays.sort(arrCopy);
        long stopA = System.currentTimeMillis();

        // Measure Collections.sort()
        ArrayList<Integer> listCopy = new ArrayList<>(list); // avoid in-place impact
        long startB = System.currentTimeMillis();
        Collections.sort(listCopy);
        long stopB = System.currentTimeMillis();

        System.out.println("Time taken by Arrays.sort(): " + (stopA - startA) + " ms");
        System.out.println("Time taken by Collections.sort(): " + (stopB - startB) + " ms");
    }
}