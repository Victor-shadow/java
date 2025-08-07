package loops;
import java.io.*;
class ForEachLoop {
    public static void main(String[]args){
        String[] names = {"Java", "Kotlin", "Scala", "Python","C++", "C#", "Javascript"};

        for (String  name: names){
            System.out.println("Language: " + name);
        }
    }
}
