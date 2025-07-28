package ExceptionHandling;

import java.io.IOException;

class SuperClassException {
    //superclass declares an exception
    void method() throws IOException{
        System.out.println("Superclass Exception");
    }
}
//SuperClass inherited by Subclass
class subClass extends SuperClassException{
    //Subclass declares method without exception
    void method(){
        System.out.println("Subclass");
    }
    public static void main(String[]args){
        SuperClassException s = new subClass();
        try {
            s.method();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

