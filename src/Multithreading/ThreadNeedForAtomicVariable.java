package Multithreading;
class CounterVariable extends Thread{
    //counter variable
    int count = 0;
    //method that will be invoked at the start of the execution of the Thread
    public void run(){
        int max = 1_000_00_000;
        //increment counter
        //total of max times
        for (int i = 0; i < max; i++){
            count++;
        }
    }
}
public class ThreadNeedForAtomicVariable {
    public static void main(String[]args) throws InterruptedException{
        //Instance of Counter class
        CounterVariable c = new CounterVariable();
        //Define two different threads
        Thread first =  new Thread(c, "First");
        Thread second = new Thread(c, "Second");
        //Threads start execution
        first.start();
        second.start();

        //main thread will wait for both threads to get completed
        first.join();
        second.join();
        //print final value of count variable
        System.out.println(c.count);

    }

}
//In a single threaded environment, the class would give only the expected result
//In a multithreaded environment it may lead to inconsistent results
//It happens because update "var" is done in three steps: Reading, Updating and Writing
//If two or more threads try to update the value at the same time then it may not update properly