package Variables;  // Package declaration

class InstanceVariable {
    // Instance Variables
    public String variableOne;
    public int variableTwo;
    public Integer variableThree;

    public InstanceVariable() {
        // Default Constructor: Initialize variables if needed
        this.variableOne = "Default Value";
    }

    public static void main(String[] args) {
        // Object Creation
        InstanceVariable objectReference = new InstanceVariable();

        // Display Output
        System.out.println("String variable: " + objectReference.variableOne);
        System.out.println("Integer variable (primitive): " + objectReference.variableTwo);
        System.out.println("Integer variable (Wrapper): " + objectReference.variableThree);
    }
}