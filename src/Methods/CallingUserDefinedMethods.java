package Methods;
//User-Defined non-static methods can be called and accessed only with the help of an instance of the class
class CallingUserDefinedMethods {
    void printMessage(){
        System.out.println("This is a user-defined method.");
    }
    public static void main(String[]args){
        //Create an object
        CallingUserDefinedMethods object = new CallingUserDefinedMethods();
        //Call the method
        object.printMessage();
    }

}
