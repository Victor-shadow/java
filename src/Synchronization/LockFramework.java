package Synchronization;
import java.security.PublicKey;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class LockFramework {
    public static void main(String[]args){
        TestResource resource = new TestResource();
        //create a fixed number of threads(2 display and 2 read)
        for (int i = 0; i < 2; i++){
            new Thread(new DisplayJob(resource), "Thread " + (i + 1)).start();

        }
        for (int i = 0; i < 4; i++){
            new Thread(new ReadJob(resource), "Thread " + (i + 1)).start();
        }
    }
}

class DisplayJob implements Runnable{
    private final TestResource resource;
DisplayJob(TestResource resource){
    this.resource = resource;
}
@Override
    public void run(){
    resource.displayRecord(new Object());
}
}

class ReadJob implements Runnable{
    private final TestResource resource;
    ReadJob(TestResource resource){
        this.resource = resource;
    }
    @Override
    public void run(){
        resource.readRecord(new Object());
    }
}

class TestResource{
    private final Lock displayLock = new ReentrantLock();
    private final Lock readLock = new ReentrantLock();

    public void displayRecord(Object document){
        displayLock.lock();

        try {
            Thread.sleep(50);
            System.out.println(Thread.currentThread().getName() + ": Displaying...");

        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            displayLock.unlock();
        }
    }

    public void readRecord(Object document){
        readLock.lock();
        try {
            Thread.sleep(50);
            System.out.println(Thread.currentThread().getName() + ": Reading...");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            readLock.unlock();
        }
    }
}
//we use Reentrant Lock class to synchronize access to a shared resource
//Two types of threads, DisplayJob and ReadJob compete for access to the TestResource
//By using separate reentrant lock objects(displayLock and readLock) for the displayRecord()
//and readRecord() methods, the code ensures that these operations can occur concurrently without
//interfering with each other