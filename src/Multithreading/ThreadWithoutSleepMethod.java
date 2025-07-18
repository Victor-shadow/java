package Multithreading;

class ThreadsA extends Thread{
    //method 1
    public void show(){
        //Iteration to print a number of times
        for (int i = 0; i < 5; i++){
            //Print statement whenever method of this class is invoked
            System.out.println("Method 1");
        }
    }
}

class ThreadsB extends Thread{
    //Method 2
    public void show(){
        //Iterate to print a number of times
        for (int i =0;i < 5; i++){
            //Print statement whenever method of this class is called
            System.out.println("Method 2");
        }
    }
}
public class ThreadWithoutSleepMethod {
    public static void main(String[]args){
        //Create objects in the main method
        ThreadsA object = new ThreadsA();
        ThreadsB object2 = new ThreadsB();

        //call the methods
        object.show();
        object2.show();
    }

}
