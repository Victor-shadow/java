package Collections;
import java.util.*;
import java.util.function.Consumer;

public class CollectionIterableForEachConsumerClass {
    public static void main(String[]args){
        List<String > arraylist = new ArrayList<>();
        arraylist.add("January");
        arraylist.add("February");
        arraylist.add("March");
        arraylist.add("April");
        arraylist.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });



    }
}
