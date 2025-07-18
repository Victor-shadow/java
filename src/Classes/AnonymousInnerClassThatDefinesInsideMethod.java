package Classes;

//Main Method
class AnonymousInnerClassThatDefinesInsideMethod {
    //Main Driver Method
    public static void main(String[]args){
        //Using Anonymous Inner Class that defines inside method/constructor argument
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child Thread");
            }
        });
        t.start();
        System.out.println("Main Thread");
    }


}
