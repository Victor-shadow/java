package Classes;

public class GetClassMethod {
    public static void main(String[]args){
        Object o = new String("A representation of characters as objects");
        //The getClass() method is used to print the runtime class of the "o" object
        Class c = o.getClass();
        System.out.println("Class of Object o is: " + c.getName());
    }
}
