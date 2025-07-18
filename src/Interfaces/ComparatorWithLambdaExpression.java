package Interfaces;
import java.util.*;

class Character {
    String name;
    Integer age;

    //Constructor
    Character(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public Integer getAge(){
        return  age;
    }
    //Method to print Details
    @Override
    public String toString(){
        return name + " : " + age;
    }
}

public class ComparatorWithLambdaExpression{
    public static void main(String[]args){
        List<Character> characters = new ArrayList<>();
        characters.add(new Character("James Gosling", 70));
        characters.add(new Character("Bjarne Stroustrup", 74));
        characters.add(new Character("Guido van Rossum", 68));
        characters.add(new Character("Dennis Richie", 70));
        characters.add(new Character("Robert Grimmer", 50));
        characters.add(new Character("Steve Jobs", 68));

        //Original list
        System.out.println("Original List:");
        //Iterate the list
        for (Character it: characters){
            System.out.println(it);
        }
        System.out.println();
        //Sort characters by name then age
        characters.sort(Comparator.comparing(Character::getName).thenComparing(Character::getAge));
        //Display message after sorting
        System.out.println("After Sorting:");
        //Iteration using enhanced for-loop after sorting ArrayList
        for (Character it: characters){
            System.out.println(it);
        }



    }
}

