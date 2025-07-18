package Classes;

//Outer Class
class OuterClass{
    //static member
    static int outer_x = 10;
    //Instance(non-static member)
    int outer_y = 100;
    //Private member
    private static int outer_private = 1000;

    //Static nested class
    static class StaticNestedClass{
        void display(){
            //can access a static member of an outer class
            System.out.println("outer_x = " + outer_x);
            //can access private static member of outer class
            System.out.println("outer_private = " + outer_private);
            //The following statement will give compilation error as static nested class cannot directly access
            //non-static methods
            //System.out.println("outer_y" + outer_y);

            //Therefore create an object of the outer class to access non-static member
            OuterClass out = new OuterClass();
            System.out.println("Outer class member: " + out.outer_y);
        }
    }
}

public class StaticNestedClassImplementation {
    public static void main(String[]args){
        //Accessing a static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }


}
