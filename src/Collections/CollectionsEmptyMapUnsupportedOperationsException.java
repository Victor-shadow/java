package Collections;
import java.util.*;

public class CollectionsEmptyMapUnsupportedOperationsException {
    public static void main(String[]args){
        Map<String, String> data = Collections.emptyMap();
        //add element
        data.put("1", "python/R");
        System.out.println(data);
    }

}
