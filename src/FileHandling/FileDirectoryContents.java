package FileHandling;
//Java program to display all contents of a directory
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
//Display contents of a directory
class FileDirectoryContents {
    public static void main(String[]args) throws IOException{
        //Enter the path and the file name
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter directory path: ");
        String dirpath = br.readLine();

        System.out.print("Enter the directory name: ");
        String  dname = br.readLine();

        //Create file object with dirpath and dname
        File f = new File(dirpath, dname);

        //if directory exists
        if (f.exists()){
            //Get the contents into arr[]
            //now arr[i] represents either a file or directory
            String []arr = f.list();
            //Find no of entries in the Directory
            int n = arr.length;

            //Display the entries
            for (int i = 0; i < n; i++){

                System.out.print(arr[i] + " ");
                //Create file object with the entry and
                //test if it is a file or directory
                if (f.isFile()) {
                    System.out.println(": is a file");
                } else if (f.isDirectory()) {
                    System.out.println(": is a directory");
                }
                else {
                    System.out.println(": Directory not found");
                }
                System.out.println("\nNo of entries in this directory : " + n);
            }
        }
            }
        }

//Here we accept a directory name from the keyboard and display all contents of the directory
//list()  method can be used as:
//String[] arr = f.list();
//The list() method causes all the directory entries to be copied into the array arr[]
//Then pass these array elements arr[i] to the file object