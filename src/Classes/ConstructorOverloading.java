package Classes;

class ConstructorOverloading {
    //Constructor with one argument
    ConstructorOverloading(String name){
        System.out.println("Constructor with One " + "argument - String: " + name);
    }
    //Constructor With Two Arguments
    ConstructorOverloading(String name, int n){
        System.out.println("Constructor with Two arguments: " + " String and Integer: " + name + " " + n);
    }
    //Constructor with One argument but of different type
    ConstructorOverloading(long l){
        System.out.println("Constructor with One Argument: " + "Long: " + l);
    }
}
class Output{
    public static void main(String[]args){
        //Creating objects of the class by passing different arguments
        //Invoke the constructor with one argument type String
        ConstructorOverloading object1 = new ConstructorOverloading("An object that contains a sequence of characters");
        //Invoke the constructor with two arguments
        ConstructorOverloading object2 = new ConstructorOverloading("Constructor Overloading allows creation of multiple constructors in the same class", 12345);
        //Invoke constructor with argument of type long
        ConstructorOverloading object3 = new ConstructorOverloading(325614567);
    }
}
