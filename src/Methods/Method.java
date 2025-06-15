package Methods;

public class Method {
    //A simple method to print a message
    public void printMessage(){
        System.out.println("A method is a block of reusable code.");
    }
    public static void main(String[]args){
        //Create a new instance of the method class
        Method object = new Method();
        //Invoke the method
        object.printMessage();

    }
}
