package Multithreading;
//Class extends Thread
class StartThread extends Thread{
    //Override the run() method
    @Override
    public void run(){
        System.out.println("Current Thread name: " + Thread.currentThread().getName());
        System.out.println("Run method called");
    }
}
class ThreadStartMethod {
    public static void main(String[]args){
        //Create a new Thread
        StartThread thread = new StartThread();
        thread.start();
    }

}
