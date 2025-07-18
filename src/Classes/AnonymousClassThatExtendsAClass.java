package Classes;

class AnonymousClassThatExtendsAClass {
    //main Driver method
    public static void main(String[]args){
        //Using anonymous class that extends an inner class(A Thread Class)
        Thread object = new Thread(){
            //run() method from the thread
            public void run(){
                //Print Statement for child thread execution
                System.out.println("Child Thread");
            }
        };
        //Start the thread
        object.start();
        //Display the main Thread for Readability
        System.out.println("Main Thread");
    }

}
