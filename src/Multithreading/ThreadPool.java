package Multithreading;
import java.lang.reflect.Executable;
import java.util.*;
import java.text.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Task class to be executed(step1)
class Task implements Runnable{
    private String name;
     public Task(String s){
         name = s;
     }
     //print task name and sleeps for 1 second
    //This whole process is repeated 5 times
    public void run(){
         try{
             for (int i = 0; i < 6; i++) {
                 if (i == 0) {
                     Date d = new Date();
                     SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                     System.out.println("Initialization time for" + " task name - " + name + " = " + ft.format(d));
                     //Print initialization time for every task
                 } else {
                     Date d = new Date();
                     SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                     System.out.println("Executing Time for task  name - " + name + " = " + ft.format(d));
                     //prints the execution for every task
                 }
                 Thread.sleep(1000);
             }
             System.out.println(name + " complete");
         }
         catch (InterruptedException e){
             e.printStackTrace();
         }
    }
}

public class ThreadPool {
    //Maximum number of Threads in a Thread Pool
    static final int MAX_T = 3;
    public static void main(String[]args){
        //Create 5 tasks
        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");

        //Creates a Thread Pool with MAX_T NO. OF
        //threads as fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
        //Passes the Task Objects to the pool to execute (Step 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        //pool shutdown
        pool.shutdown();
    }


}
