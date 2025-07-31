package Synchronization;
import java.io.*;
//a class used to send a message
class Sender{
    public void send(String msg){
        System.out.println("Sending: " + msg);
        try {
            Thread.sleep(100);//changed to print without new line
        }
        catch (Exception e){
            System.out.println("Thread interrupted");
        }
        System.out.println(msg + "Sent"); //improved output format

    }
}
//class for sending messages using threads
class ThreadSend extends Thread{
   private String msg;
   Sender sender;

   //receives message object and string message to be sent
    ThreadSend(String m, Sender obj){
        msg = m;
        sender = obj;
    }
    public void run(){
        //only one thread can send a message
        synchronized (sender){
            //synchronizing the send object
            sender.send(msg);
        }
    }
}
public class SynchronizationThread {
  public static void main(String[]args){
      Sender send= new Sender();
      ThreadSend S1 = new ThreadSend("Java", send);
      ThreadSend S2 = new ThreadSend("Kotlin", send);
      //start two threads
      S1.start();
      S2.start();
      //wait for threads to end
      try {
          S1.join();
          S2.join();
      }
      catch (Exception e){
          System.out.println("Interrupted");
      }
  }
}
//we choose to synchronize the Sender object inside the run() method of the ThreadSend class
//Alternatively, we could define the whole send() block as synchronized  producing the same result
//We do not always have to synchronize a whole method. Sometimes it is preferable to synchronize part of a method
//