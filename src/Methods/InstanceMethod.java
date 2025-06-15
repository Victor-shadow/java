package Methods;
class TestString{
    String n = "";
    //Instance Method: Takes an argument usually the declared variable
    public void test(String n){
        this.n = n;
    }

}
public class InstanceMethod {
    public static void main(String[]args){
        //Create an Instance of the class
        TestString object = new TestString();
        //Calling the instance method in the main Method
        object.test("A String is also is a class that is immutable");
        System.out.println(object.n);

    }

}
