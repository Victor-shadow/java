package Methods;

class StringVariableArguments {
    //Method that accepts variable number of String arguments using var args
    //String... n allows the method to accept a variable number of arguments

    public static void Input(String... n){
        //Iterate through the array elements and print each input
        for(String i: n){
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        //Calling the Names Method with different Number of Arguments
        Input("A String is an object that stores a sequence of characters", "An array is a collection that stores values of the same data type in a single variable");
        Input("A class is a blueprint for creating objects", "An Interface is a blueprint of a class");
    }

}
