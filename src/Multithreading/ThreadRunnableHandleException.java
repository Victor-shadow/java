package Multithreading;
import java.io.FileNotFoundException;
public class ThreadRunnableHandleException {
    private class RunnableInterface implements Runnable{
        //Override the run() method
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + ", executing run() method!");
            //Checked exception cannot be thrown
            //Runnable must handle CheckedException Itself
            try{
                throw new FileNotFoundException();
            }
            catch (FileNotFoundException e){
                System.out.println("Must Catch Here");
                e.printStackTrace();
            }
            int r = 1 / 0;
            //Commented line below is an example of thrown RuntimeException
            //throw new NullPointerException()
        }
    }
    public static void main(String[]args){
        System.out.println("Main Thread is: " + Thread.currentThread().getName());
        //Create a thread
        Thread t1 = new Thread(new ThreadRunnableHandleException().new RunnableInterface());
        //start the thread
        t1.start();

    }

}
