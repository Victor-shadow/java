package Collections;
import java.lang.*;
import java.util.*;

class Individual{
    int rollno;
    String name, address;

    //Constructor
    public Individual(int rollno, String name, String address){
        this.name= name;
        this.address=address;
        this.rollno=rollno;
    }
    //used to print student details in main
    public String toString(){
        return  this.name + " " + this.address + " " + this.rollno;
    }
}
class SortByRoll implements Comparator<Individual>{
    //sorting in ascending order
    public int compare(Individual a, Individual b){
        return a.rollno - b.rollno;
    }
}
public class CollectionsSortMethodUseOfComparator {
    public static void main(String[]args){
        ArrayList<Individual> arr = new ArrayList<Individual>();
        arr.add(new Individual(111, "bbbb", "london"));
        arr.add(new Individual(131, "aaaa", "nyc"));
        arr.add(new Individual(121, "cccc", "jaipur" ));

        System.out.println("Unsorted");
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        Collections.sort(arr, new SortByRoll());
        System.out.println("\nSorted by rollno");
        for (int i = 0; i <arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
