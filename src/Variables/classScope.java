package Variables;

public class classScope {
    // Instance Variables (Class Scope, unique per object)
    public String instanceVariableOne;
    public int instanceVariableTwo;

    // Static Variables (Class Scope, shared among all objects)
    public static String staticVariableOne;
    public static int staticVariableTwo;

    // Constructor to initialize instance variables
    public classScope(String instanceVariableOne, int instanceVariableTwo) {
        this.instanceVariableOne = instanceVariableOne;
        this.instanceVariableTwo = instanceVariableTwo;
    }

    // Method to demonstrate class scope
    public void output() {
        // Accessing Instance Variables
        System.out.println(instanceVariableOne);
        System.out.println(instanceVariableTwo);

        // Accessing Static Variables
        System.out.println(staticVariableOne);
        System.out.println(staticVariableTwo);
    }

    public static void main(String[] args) {
        // Assign values to static variables
        staticVariableOne = "Shared Data";
        staticVariableTwo = 100;

        // Create an object and test the method
        classScope objectReference = new classScope("Object Data", 25);
        objectReference.output();
    }
}