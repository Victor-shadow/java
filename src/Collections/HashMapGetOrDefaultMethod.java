package Collections;
import java.util.*;
public class HashMapGetOrDefaultMethod {
    public static void main(String[]args){
        Map<String, Integer> map = new HashMap<>();
        map.put("Android", 1);
        map.put("Windows", 2);
        //key Linux does not exist so the default value is returned
        int a = map.getOrDefault("Linux", 0);
        System.out.println("Value of Linux: " + a);

    }
}
