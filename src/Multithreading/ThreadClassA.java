package Multithreading;

class TestThread extends  Thread{
    //Override run method
    @Override
    public void run(){
        for (int i =0; i < 5; i++){
            System.out.println("Current Thread: " + Thread.currentThread().getName() + " - Count: " + i );
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println("Thread Interrupted");
            }
        }
    }
}
public class ThreadClassA {
    public static void main(String[]args){
        TestThread object = new TestThread();
        TestThread object2 = new TestThread();

        object.setName("Thread 1");
        object2.setName("Thread 2");

        //start thread 1
        object.start();
        //start thread 2
        object2.start();
    }

}
//Execution of thread is not according to sequence, It can be executed in any sequence