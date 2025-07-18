package Collections;
import java.util.*;
public class CollectionsSingletonMapMethod {
    public static void main(String[] argv) throws Exception {
        try {
            Map<Integer, Boolean> map = Collections.singletonMap(1, true);
            //Print Singleton Map
            System.out.println("Singleton map is: " + map);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown: " + e);
        }
    }
}
