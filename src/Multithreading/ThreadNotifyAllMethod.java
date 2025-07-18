package Multithreading;

class ThreadAA extends Thread{
    public void run()
    {
        synchronized (this)
        {
            System.out.println(
                    Thread.currentThread().getName()
                            + "...starts");
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    Thread.currentThread().getName()
                            + "...notified");
        }
    }
}
class ThreadBB extends Thread{
    ThreadAA thread_a;
    ThreadBB(ThreadAA thread_a){
    this.thread_a = thread_a;
    }
    public void run(){
        synchronized (this.thread_a){
            System.out.println(Thread.currentThread().getName() + "...starts");
            try{
                this.thread_a.wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "...notified");
        }
    }
}

class ThreadCC extends Thread{
    ThreadAA thread_a;
    ThreadCC(ThreadAA thread_a){
        this.thread_a = thread_a;
    }
    public void run(){
        synchronized (this.thread_a){
            System.out.println(Thread.currentThread().getName()+ "...starts");
            this.thread_a.notifyAll();
            System.out.println(Thread.currentThread().getName()+ "...notified");
        }
    }
}
public class ThreadNotifyAllMethod {
    public static void main(String[]args) throws InterruptedException{
        ThreadAA thread1 = new ThreadAA();
        ThreadBB thread2 = new ThreadBB(thread1);
        ThreadCC thread3 = new ThreadCC(thread1);

        Thread t1 = new Thread(thread1, "thread-1");
        Thread t2 = new Thread(thread2, "thread-2");
        Thread t3 = new Thread(thread3, "thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();

    }
}
