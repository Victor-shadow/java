package Variables;

class StaticVariable {
    //Declare Static variable
    public static String variableName = "Default Value";
    //Accessing Static variables without object creation
    public static void main(String[]args) {
        System.out.println("Static variables output: " + StaticVariable.variableName);
        //static DataType localVar = value; //Causes an error
        //Static variables cannot be declared inside methods
    }

}
