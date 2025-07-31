package InputOutput;

class FileCommandLineArgument {
    public static void main(String[] args) {
        //check if the length of the args array is greater than zero
        if (args.length > 0) {
            System.out.println("The command line arguments are: ");
            //iterate the args array and print
            //command line arguments
            for (String val : args) {
                System.out.println(val);
            }
            } else{
                System.out.println("No command line " + "arguments found");
            }
        }
    }

