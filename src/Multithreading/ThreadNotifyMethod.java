package Multithreading;

class ThreadNotifyA extends Thread {
    public void run(){
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName() + "...starts");
            try{
                this.wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "...notify");
        }
    }
}
class ThreadNotifyB extends Thread{
    ThreadNotifyA threadA;
    ThreadNotifyB(ThreadNotifyA threadA){
        this.threadA = threadA;
    }
    public void run(){
        synchronized (this.threadA){
            System.out.println(Thread.currentThread().getName() + "...starts");
            try{
                this.threadA.wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "...notified");
        }
    }
}
class ThreadNotifyC extends Thread{
    ThreadNotifyA threadA;
    ThreadNotifyC(ThreadNotifyA threadA){
        this.threadA = threadA;
    }
    public void run(){
        synchronized (this.threadA){
            System.out.println(Thread.currentThread().getName() + "...starts");
            this.threadA.notify();
            System.out.println(Thread.currentThread().getName() + "...notified");
        }
    }
}
class ThreadNotifyMethod{
    public static void main(String[]args) throws InterruptedException{
        ThreadNotifyA threadA = new ThreadNotifyA();
        ThreadNotifyB threadB = new ThreadNotifyB(threadA);
        ThreadNotifyC threadC = new ThreadNotifyC(threadA);

        Thread t1 = new Thread(threadA, "Thread-1");
        Thread t2 = new Thread(threadB, "Thread-2");
        Thread t3 = new Thread(threadC, "Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}


