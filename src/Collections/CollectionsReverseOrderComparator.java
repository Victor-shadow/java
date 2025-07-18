package Collections;
import java.io.*;
import java.util.*;
import java.lang.*;

//Class 1
class Character {
    int rollno;
    String name, address;
    //Constructor
    public Character(int rollno, String name, String address){
        //this keyword to refer to the current instance
        this.rollno =rollno;
        this.name=name;
        this.address=address;
    }
    //Method of Character Class
    public String toString(){
        return this.rollno + " " + this.name + " " + this.address;
    }
}

//Class 2
//Helper class implement Comparator interface
class Sortbyroll implements Comparator<Character>{
    //method used for sorting in Ascending order
    public int compare(Character a, Character b){
        return a.rollno - b.rollno;
    }
}

//Main Class
class CollectionsReverseOrderComparator{
    public static void main(String[]args){
        //Create an empty array list
        ArrayList<Character> array = new ArrayList<Character>();
        //Adding custom attributes defined in Character class using add method
        array.add(new Character(111, "bbbb", "london"));
        array.add(new Character(131, "aaa", "nyc"));
        array.add(new Character(121, "cccc", "jaipur"));
        //Display message for readability
        System.out.println("Unsorted");
        //print list of students
        for (int i = 0; i <array.size(); i++){
            System.out.println(array.get(i));
        }
        //Sort a list of Characters in descending order of roll no using Comparator that is reverse of sortRoll
        Comparator c = Collections.reverseOrder(new Sortbyroll());
        Collections.sort(array, c);
        //Display message for better readability
        System.out.println("\nSorted by rollno");
        for (int i = 0; i <array.size(); i++){
            System.out.println(array.get(i));
        }


    }

}
