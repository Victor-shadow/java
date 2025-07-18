package Collections;
import java.util.*;
import java.util.function.Consumer;

class CityConsumer implements Consumer<Integer >{
    @Override
    public void accept(Integer t){
        System.out.println(t);
    }
}
public class CollectionIterableForEachCityConsumer {
    public static void main(String[]args){
        List<Integer> data = new ArrayList<Integer >();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);

         //create an object of city consumer and pass for each method to it
        CityConsumer cityConsumer = new CityConsumer();
        data.forEach(cityConsumer);

    }
}
