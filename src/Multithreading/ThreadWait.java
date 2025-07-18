package Multithreading;

class One{
    private int bullets = 40;
    //This method fires the number of objects passed to it
    //when the objects are zero it calls the wait() method and releases the lock
    synchronized public void fire(int bulletsToBeFired){
        for (int i = 1; i < bulletsToBeFired; i++){
            if (bullets == 0){
                System.out.println(i -1 + " objects to be fired and " + bullets + "remains ");
                System.out.println("Invoking the wait() method");
                try{
                    wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Continue to fire after reloading");
            }
            bullets--;
        }
        System.out.println("the firing process is complete");
    }
    //reload increases the objects by 40 everytime it is invoked
    //it calls the notify method which wakes up the thread that was sent to sleep using wait()
    //inside fire() method
    synchronized public void reload(){
        System.out.println("Reloading the bullets and resuming " + " the thread using notify()");
        bullets += 40;
        notify();
    }
}

public class ThreadWait {
    public static void main(String[] args) {
        One object = new One();
        //Create a new thread and invoke fire() method on it
        new Thread() {
            @Override
            public void run() {
                object.fire(60);
            }
        }.start();

        //Create a new thread and invoke reload() method on it
        new Thread() {
            @Override
            public void run() {
                object.reload();
            }
        }.start();
    }
}
