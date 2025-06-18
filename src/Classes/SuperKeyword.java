package Classes;

class parent{
    void Display(){
        System.out.println("This is a method in the parent class");
    }
}
class child extends parent{
    //This method overrides Display() method in the parent class
    @Override
    void Display() {
        super.Display();
        System.out.println("This is a child class method");
    }
}
public class SuperKeyword {
    public static void main(String[]args){
        parent object = new child();
        object.Display();
    }
}
