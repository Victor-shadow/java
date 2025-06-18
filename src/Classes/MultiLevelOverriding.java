package Classes;
//Base class
class base{
    void Display(){
        System.out.println("Parent class Method");
    }
}
//Inherited class
class inheritor extends base{
    //This method overrides the parent class method
    void Display(){
        System.out.println("The Child Class Method");
    }
}
//Inherited class
class Grand extends inheritor{
    //Method overriding
    void Display(){
        System.out.println("The Grand Class Method");
    }
}
//Main Class
public class MultiLevelOverriding {
    public static void main(String[]args){
        base object = new Grand();
        object.Display();
    }
}
