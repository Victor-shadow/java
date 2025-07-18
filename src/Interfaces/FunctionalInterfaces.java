package Interfaces;

class FunctionalInterfaces {
    public static void main(String[]args){
        //Create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created.");
            }
        }).start();
    }

}
