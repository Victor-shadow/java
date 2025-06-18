package Classes;

public class DynamicBinding {
    //static nested inner class1
    //Class
    public static class superclass{
        //Method of Inner Class
        void print(){
            System.out.println("print in superclass is called");
        }
    }

    //Class2
    public static class subclass extends superclass{
        //Inner method 2
        @Override void print(){
            System.out.println("Subclass method is invoked");
        }
    }
    public static void main(String[]args){
        //Creation of objects of inner class 1
        //with reference to constructor of super class
        superclass A = new superclass();
        //Creation of objects of inner class 2
        //with reference to constructor of subclass
        superclass B = new subclass();
        //Invoke print Methods
        A.print();
        B.print();
    }
}

//Methods are not static

