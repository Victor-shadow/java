package Collections;
import java.util.*;
public class MapPutAllMethod {
    public static void main(String[]args){
        //Initialize a map of type HashMap
        Map<String,String> map = new HashMap<>();
        map.put("1", "One");
        map.put("3", "Three");
        map.put("5", "Five");
        map.put("7", "Seven");
        System.out.println(map);

        Map<String, String> map1 = new HashMap<>();
        map1.put("10", "Ten");
        map1.put("30","Thirty");
        map1.put("50","Fifty");

        map.putAll(map1);
        System.out.println(map);

    }
}
