package Multithreading;
//Helper class
class A extends Thread {
    //Method 1
    public void show() {
        //Iterate to print the number of times
        for (int i = 0; i < 5; i++) {
            //Print statement
            System.out.println("Target");
            //Make thread to sleep using sleep() method
            //Try-Catch block for exceptions
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
//Helper class 2
class B extends Thread{
    //Method 2
    public void show(){
        for (int i = 0; i < 5; i++){
            //Print statement
            System.out.println("Miss");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadSleepMethodInSerialExecution {
    public static void main(String[]args){
        //Create objects in the main method
        A object = new A();
        B object2 = new B();
        //Start the thread objects
        object.start();
        object2.start();
        //Invoke methods
        object.show();
        object2.show();
    }

}
