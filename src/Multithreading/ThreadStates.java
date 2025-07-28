package Multithreading;

class TicketBookingSystem implements Runnable{
    @Override
    public void run(){
        try{
            //Timed Waiting
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of the booking thread while main Thread is waiting: " + ThreadStates.mainThread.getState());
        try{
            //Another Timed Waiting
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class ThreadStates implements Runnable{
    public static Thread mainThread;
    public  static ThreadStates ticketSystem;

    @Override
    public void run(){
        TicketBookingSystem booking = new TicketBookingSystem();
        Thread bookingThread = new Thread(booking);

        System.out.println("State after creating bookingThread: " + bookingThread.getState());
        bookingThread.start();
        System.out.println("State after starting bookingThread: " + bookingThread.getState());

        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State after sleeping bookingThread: " + bookingThread.getState());

        try{
            //Moves main thread to waiting state
            bookingThread.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("State after bookingThread finishes: " + bookingThread.getState());
    }
    public static void main(String[]args){
        ticketSystem = new ThreadStates();
        mainThread = new Thread(ticketSystem);

        System.out.println("State after creating main Thread: " + mainThread.getState());
        mainThread.start();

        System.out.println("State after starting main Thread: " + mainThread.getState());
    }
}
//when a new thread is created, the thread is in the NEW state
//when the start() method is called on a thread, the thread scheduler moves it to the Runnable State
//Whenever the join() method is called on a thread instance, the main thread goes into Waiting, for the booking thread to complete
//Once the thread run() method completes, the state becomes terminated