package Methods;

class IntegerVariableArguments {

    // A static method that takes a variable number of arguments of integer type
    static void fun(int... n) {
        // Access Length of the Arguments
        System.out.print("Number of Arguments: " + n.length);
        // Using for-each loop to display contents of n
        for (int i : n) {
            System.out.print(i + " ");
        }
        // Adding a line break for separation
        System.out.println();
    }

    public static void main(String[] args) {
        // Invoking the var args method with:
        // One parameter
        fun(100);
        // Multiple parameters
        fun(100, 200, 300, 400, 500, 600, 700, 800, 900);
        // No parameters
        fun();
    }
}