package LambdaExpressions;
import java.util.*;
class LambdaExpressionWithSingleParameter {
    public static void main(String[]args){
        //Create an Array List with Elements
        //{1, 2, 3, 4}
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);

        //Use lambda Expression to print all elements of arrlist
        System.out.println("Elements of the ArrayList: ");
        arrlist.forEach(n -> System.out.println(n));
        //Using Lambda Expression to print even elements of the arrlist
        System.out.println("Even Elements of the Array List: ");
        arrlist.forEach(n -> {
            if (n % 2 == 0){
                System.out.println(n);
            }
        });
    }

}
//we are using lambda expression with the forEach() method and it internally works with the consumer
//functional interface
//The Consumer interface takes a single parameter and performs an action on it