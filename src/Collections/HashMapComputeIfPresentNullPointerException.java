package Collections;
import java.util.*;
public class HashMapComputeIfPresentNullPointerException {
    public static void main(String[]args){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 10);
        //pass null to the remapping function
        //throws NullPointerException
        hashMap.computeIfPresent("Java", null);

    }
}
