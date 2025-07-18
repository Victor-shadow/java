package Multithreading;
import java.io.*;
//Helper class used to send  a message
class Sender{
    public void send(String msg){
        System.out.println("Sending: " + msg);//changed to print without new line
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("Thread Interrupted");
        }
        System.out.println(msg + "Sent"); //improved format for output
    }
}
//Class for sending messages using threads
class ThreadSend extends Thread{
    private String msg;
    Sender sender;
    //Receives a message object and string message to be sent
    ThreadSend(String m, Sender object){
        msg = m;
        sender = object;
    }
    public void run(){
        //Only one thread can send a message at a time
        synchronized (sender){
            //synchronize the send object
            sender.send(msg);
        }
    }
}
public class ThreadSynchronize {
  public static void main(String[]args){
      Sender send = new Sender();
      ThreadSend S1 = new ThreadSend("Java", send);
      ThreadSend S2 = new ThreadSend("Kotlin", send);
      //start two threads of send type
      S1.start();
      S2.start();
      //Wait for threads to end
      try{
          S1.join();
          S2.join();
      }
      catch (Exception e){
          System.out.println("Interrupted");
      }
  }
}
//We choose to synchronize a sender object inside the run() method of the ThreadSend class
//Alternatively, one can define the whole send() block as synchronized producing the same result. Then we do not have to synchronize the message object
//inside the run() method of ThreadSend() class
//We do not have to synchronize a whole method. Sometimes, it is preferable to synchronize only part of a method
//Java synchronized blocks inside method makes this possible
