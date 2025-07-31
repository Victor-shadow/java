package Synchronization;

class Count{
    private  volatile  int count; //volatile variable
    public void increment(){
        //this operation is not atomic
        count++;
    }

    public int getCount() {
        return count;
    }

}
public class VolatileModifier {
   public static void main(String[]args){
       Count c = new Count();
       Thread t1 = new Thread(() -> {
           for (int i = 0; i < 1000; i++){
               c.increment();
           }
       });

       Thread t2 = new Thread(() -> {
           for (int i = 0; i < 1000; i++){
               c.increment();
           }
       });

       t1.start();
       t2.start();
       try {
           t1.join();
           t2.join();
       }
       catch (InterruptedException ex){
           ex.printStackTrace();
       }
       System.out.println("Count: " + c.getCount());
   }
}
//the volatile variable is count
//While volatile ensures visibility of changes across all threads  and the increment operation is non-atomic
//race condition can still occur
