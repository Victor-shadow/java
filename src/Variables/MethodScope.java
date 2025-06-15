package Variables;

public class MethodScope {
    // Method declaration with return type
    public void output() {
        // Local variable (method scope)
        String variableName = "Default Value";
        // Perform operations
        System.out.println("Using variable inside method: " + variableName);
    }

    public static void main(String[] args) {
        // Invoke the method
        MethodScope objectReference = new MethodScope();
        objectReference.output();
        // System.out.println(variableName); // Causes an error, variable is out of scope
    }
}