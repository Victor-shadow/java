package Multithreading;
import java.util.*;
public class InterthreadCommunication {
    //Shared Queue used by both the producer and the consumer
    private static final Queue<Integer> queue = new LinkedList<>();
    //Maximum capacity of the queue
    private static final int capacity = 10;
    //Producer Task
    private static final Runnable producer  = new Runnable() {
        public void run() {
            while (true){
                synchronized (queue){
                    //wait if the queue is full
                    while (queue.size() == capacity){
                        System.out.println("Queue is at maximum capacity");
                    }
                    //Add item into the queue
                    queue.add(10);
                    System.out.println("Added 10 to the queue");
                    queue.notifyAll(); //Notify all waiting customers
                    try{
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }

        }
    };
    //Consumer task
    private static final Runnable consumer = new Runnable() {
        public void run() {
            while (true){
                synchronized (queue){
                    //wait if the queue is empty
                    while (queue.isEmpty()){
                        System.out.println("Queue is empty, waiting");
                    }
                    //remove the item from the queue
                    System.out.println("Removed: " + queue.remove() + " from the queue");
                    queue.notifyAll(); //Notify all waiting producers
                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    };
    public static void main(String[]args){
        System.out.println("Main Thread started: ");

        //Create and start the producer thread
        Thread producerThread = new Thread(producer, "Producer");
        //Create and start the consumer Thread
        Thread consumerThread = new Thread(consumer, "Consumer");
        producerThread.start();
        consumerThread.start();
        System.out.println("Main Thread Exiting: ");
    }


}
