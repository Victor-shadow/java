package Methods;

//Static methods belong to the class and can be called without creating the object
class Message {
    static void printMessage(){
        System.out.println("Calling Static Methods");
    }
}
public class CallingStaticMethods{
    public static void main(String[]args){
        Message.printMessage(); //Static method invoked from the main Class

    }
}
