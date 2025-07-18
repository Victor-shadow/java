package Classes;

//Main Class
public class AnonymousInnerClassThatExtendsAnInterface {
    //Main Driver Method
    public static void main(String[]args){
        //Here we are using an Anonymous inner class that implements an interface
        //Runnable Interface
        Runnable r = new Runnable() { //Starts here the anonymous inner class that extends the interface
            @Override
            public void run() {
                //Print statement when run is invoked
                System.out.println("Child Thread");
            }
        };
        //Creating a thread in main() using Thread Class
        Thread t = new Thread(r);
        //Starting the thread which invokes run method automatically
        t.start();
        System.out.println("Main Thread");
    }

}
