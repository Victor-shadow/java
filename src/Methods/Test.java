package Methods;

//The Test Class is a constructor and has two methods m1, m2
public class Test {
    //A static variable shared by all instances of the Test class initialized to zero
    public static int i = 0;
    //Constructor to count objects
    //- Constructor called each time a Test object is created.
    //- Increments i by 1, keeping track of how many objects have been created.
    Test(){
        i++;
    }
    //Static method to get the number of objects created
    public static int get(){
        return i; //- Returns the current value of i (number of objects created).

    }
    //Instance method m1 calling another method m2
    //- An instance method (requires an object to be called).
    //- Prints a message, calls another method m2() using this, and returns 1.
    public int m1(){
        System.out.println("Inside method 1");
        this.m2(); //- The keyword this refers to the current object that’s running m1.
        //- run m2() on this same object.”
        return 1;
    }
    //Method m2 prints message
    public void m2(){
        System.out.println("In method 2");
    }
}
class CallingMethods{
    //Main Driver Method
    public static void main(String[]args){
        //static: It belongs to the class itself, not an object.
        //Create object of Test Class
        Test object = new Test();
        //Calling m1 object using the class object
        //🔹 int i = object.m1();
        //- Calls the instance method m1() on the object.
        //- This will:
        //- Print "Inside method 1"
        //- Internally call m2() on the same object (which prints "In method 2")
        //- Return the value 1
        //- The returned value (1) is stored in the variable i.
        int i = object.m1();
        System.out.println("Control returned after m1: " + i);
        //Calling the get method directly using the class name
        int o =Test.get();
        //Print Results
        System.out.println("Number of instances created: " + o);
    }
}

