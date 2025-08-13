package Collections;
import java.util.*;
class MapInterfaceHashMaps {
    public static void main(String[]args){
        int [] a= {1, 13, 4, 1, 41, 31, 31, 4, 13, 2};
        //Put all elements in an array list
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
            arrayList.add(a[i]);
        }
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        //counting the occurrence of numbers
        for (int i = 0; i < arrayList.size(); i++){
            hashmap.putIfAbsent(arrayList.get(i), Collections.frequency(arrayList, arrayList.get(i)));
        }
        System.out.println(hashmap);

    }

}
