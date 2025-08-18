package Collections;
import java.util.*;

class CollectionSpliteratorHashSet {
    public static void main(String[]args){
        HashSet<Integer> list1 = new HashSet<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        Spliterator<Integer> spliterator = list1.spliterator();
        System.out.println("The collection contains: ");
        while (spliterator.tryAdvance((element) -> System.out.println(element + "")));


    }
}
