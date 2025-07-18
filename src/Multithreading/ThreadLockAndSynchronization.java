package Multithreading;

class CounterObject {
    int counter = 0;

    // Method to increment the counter
    public synchronized void increment() {
        int max = 100_000_000;
        for (int i = 0; i < max; i++) {
            counter++;
        }
    }
}

public class ThreadLockAndSynchronization {
    public static void main(String[] args) throws InterruptedException {
        CounterObject count = new CounterObject();

        // Define two threads that call the increment method
        Thread first = new Thread(() -> count.increment(), "Thread-1");
        Thread second = new Thread(() -> count.increment(), "Thread-2");

        // Start both threads
        first.start();
        second.start();

        // Wait for both threads to finish
        first.join();
        second.join();

        // Print final counter value
        System.out.println("Final Counter Value: " + count.counter);
    }
}
//Using lock analogy and synchronization: Synchronization or Locking can solve the problem,but it compromises time efficiency and performance
//First it mandates resource and thread scheduler to control lock
//Second when multiple threads attempt to acquire a lock, only one of them wins rest are suspended and blocked
//Suspending or blocking threads can have huge impact on performance
