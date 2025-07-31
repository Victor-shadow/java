package Synchronization;

class TicketBooking{
    private int availableTickets = 30;
    //shared resource(available tickets)

    //synchronized methods for booking tickets
    public synchronized void bookTicket(int tickets){
        if (availableTickets >= tickets){
            availableTickets -= tickets;
            System.out.println("Booked " + tickets + " tickets, Remaining tickets: " + availableTickets);
        } else{
            System.out.println("Not enough tickets available to book " + tickets);
        }
    }
    public int getAvailableTickets(){
        return availableTickets;
    }
}
public class ThreadSynchronization {
   public static void main(String[]args){
       TicketBooking booking = new TicketBooking();//shared resource
       //Thread 1 to book tickets
       Thread t1 = new Thread(() -> {
           for (int i = 0; i < 2; i++){
               booking.bookTicket(2); //try to book two tickets
               try {
                   Thread.sleep(50);
               }
               catch (InterruptedException e){
                   e.printStackTrace();
               }
           }
       });
       //Thread 2 to book tickets
       Thread t2 = new Thread(() -> {
           for (int i = 0; i < 2; i++){
               booking.bookTicket(3);//try to book three tickets
               try {
                   Thread.sleep(40);
               }
               catch (InterruptedException e){
                   e.printStackTrace();
               }
           }
       });
       //start both threads
       t1.start();
       t2.start();
       try {
           t1.join();
           t2.join();
       } catch (InterruptedException e){
           e.printStackTrace();
       }
       //print final remaining tickets
       System.out.println("Final Available Tickets: " + booking.getAvailableTickets());
   }
}
