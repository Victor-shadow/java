package Multithreading;

class MyThreadA extends Thread{
    //Override the run() method
    @Override
    public void run(){
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        System.out.println("Run method invoked");
    }
}
class ThreadInvokeRunMethodDirectly {
    public static void main(String[]args){
        //Create thread
        MyThreadA thread = new MyThreadA();
        thread.run();

    }

}
