package Classes;

import org.ietf.jgss.Oid;

//OuterClass
class OuterClassA{
    //static member
    static int outer_x = 20;
    //instance(non-static member)
    int outer_y = 20;
    //Private member
    private int outer_private = 30;

    //Inner Class
    class InnerClassA{
        void display(){
            //can access static member of outer class
            System.out.println("outer_class = " + outer_x);
            //can also access non-static member of outer class
            System.out.println("non_static_member = " + outer_y);
            //A private member can also be accessed from the outer class
            System.out.println("private_member = " + outer_private);
        }
    }
}
//Implementation
public class NestedInnerClass {
    public static void main(String[]args){
        //accessing an inner class
        OuterClassA outerObject = new OuterClassA();
        OuterClassA.InnerClassA innerObject = outerObject.new InnerClassA();

        innerObject.display();
    }

}
