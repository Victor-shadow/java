package Methods;

class VarargsWithMultipleArguments {

    // String is taken as an argument followed by varargs
    static void fun2(String s, int... a) {
        System.out.println("String: " + s); //
        System.out.println("Number of arguments is: " + a.length);

        // Using for-each loop to display contents of a
        for (int i : a) {
            System.out.print(i + " "); //
        }

        System.out.println(); //
    }

    public static void main(String[] args) {
        // Calling fun2() with different parameter sets
        fun2("bool", 100, 200);
        fun2("int", 1, 2, 3, 4, 5);
        fun2("float"); // Valid: zero int arguments
    }
}