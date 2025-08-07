package WrapperClass;

class WrapperIntegerClass {
    public static void main(String[]args){
        //Primitive data types
        int b;
        //integer wrapper class
        Integer a;
        //assign values to a primitive data type
        b = 300;
        //auto-boxing or auto-wrapping
        //converting primitive int to integer object
        a = b;
        System.out.println("The primitive int b is: " +b);
        System.out.println("The Integer object a is: " + a);
    }
}
