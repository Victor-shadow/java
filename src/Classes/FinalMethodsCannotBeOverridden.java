package Classes;
//In Java final methods cannot be overridden
class ParentNameA{
    //Cannot be overridden
    final void show(){
        System.out.println("This method cannot be overridden");
    }
}
class ChildNameA{
    //produces an error
    boolean show(){
        return false;
    }
}

public class FinalMethodsCannotBeOverridden {
    public static void main(String[]args){
        //Child Class Object
        ChildNameA object = new ChildNameA();
        System.out.println(object.show());
    }
}
