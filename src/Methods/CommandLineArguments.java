package Methods;
//Java Program to check command-line arguments
class CommandLineArguments {
    public static void main(String[]args){
        //Check if the length of the args array is greater than 0
        if(args.length > 0){
            //Print Statements
            System.out.println("The command line" + " arguments are:");
            //Iterate the args array
            for(String val: args){
                System.out.println(val);
            }
        }
        else {
            System.out.println("No command-line " + "arguments found:");
        }
    }
}
