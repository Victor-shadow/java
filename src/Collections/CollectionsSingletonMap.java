//The singletonMap() of the java.util.Collections class is used to return an immutable map , mapping only the specified key to the specified value
//The returned map is Serializable
//Syntax:
//public static Map SingletonMap(K Key, V Value)
//parameters:
//key-The sole key to be stored in the returned map
//value-The values to which the returned map  maps keys
//Return value: This method returns an immutable map containing only the specified key-value mapping

package Collections;
import java.util.*;
public class CollectionsSingletonMap {
    public static void main(String[]argv) throws Exception{
        //try catch block
        try{
            //Create a SingleTon Map using singletonMap() Method
        Map<String,String> map = Collections.singletonMap("key", "value");
        //print Singleton Map
            System.out.println("Singleton map is: " + map);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
