//Ticket Booking System
package Multithreading;
class TicketBooking{
    private int availableTickets = 10; //shared resource
    //synchronized method for booking tickets
    public synchronized void bookTicket(int tickets){
        if (availableTickets >= tickets){
            availableTickets -= tickets;
            System.out.println("Booked " + tickets + "tickets, remaining Tickets: " + availableTickets);
        } else{
            System.out.println("Not enough tickets available to book " + tickets);
        }
    }
    public int getAvailableTickets(){
        return availableTickets;
    }
}

public class ThreadsSynchronization {
  public static void main(String[]args){
      TicketBooking booking = new TicketBooking();//Shared Resource
      //Thread 1 to book tickets
      Thread thread1 = new Thread(() -> {
          for (int i = 0; i < 2; i++){
              booking.bookTicket(2); //Try to book two tickets each time
              try{
                  Thread.sleep(50);
              }
              catch (InterruptedException e){
                  e.printStackTrace();
              }
          }
      });
      Thread thread2 = new Thread(() -> {
          for (int i =0; i < 2; i++){
              booking.bookTicket(3); //try to book three tickets each at a time
              try {
                  Thread.sleep(40);
              }
              catch (InterruptedException e){
                  e.printStackTrace();
              }
          }
      });
      //start both threads
      thread1.start();
      thread2.start();
      //wait for threads to finish
      try{
          thread1.join();
          thread2.join();
      } catch (InterruptedException e){
          e.printStackTrace();
      }
      //Print final remaining tickets
      System.out.println("Final Available Tickets: " + booking.getAvailableTickets());
  }
}
//The TicketBooking class contains a synchronized method bookTicket() which ensures that only one thread
//can book tickets at a time preventing race conditions and overbooking
//Each thread attempts to book a set of number of tickets in a loop, with thread synchronization ensuring that the availableTickets variable
//is safely accessed and updated
//Finally the program prints the remaining number of tickets