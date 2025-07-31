package Synchronization;
import java.io.*;
import java.util.*;

class Java{
    String n = "";
    public int count = 0;
    //method where only a block is synchronized
    public void JavaName(String name, List<String> list ){
        //only one thread is allowed to change the name at a time
        synchronized (this){
            n = name;
            //keep track of how many threads have changed the name
            count++;
        }
        //other threads are allowed to add name to the list concurrently
        list.add(name);
    }
}
class BlockSynchronization {
    public static void main(String[]args){
        Java j = new Java();
        List<String> list = new ArrayList<String>();
        j.JavaName("Kotlin", list);
        System.out.println(j.n);
    }

}
//The JavaName() method modifies the name variable  and tracks how many times it has been changed
//using the count variable.The synchronized block ensures that only one thread can modify the name and update the count at a time
//Adding names to the list is not synchronized, allowing multiple threads  to add names concurrently
//without issues