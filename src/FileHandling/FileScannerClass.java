package FileHandling;
import java.util.*;
import java.io.*;
public class FileScannerClass {
  public static void main(String[]args) throws Exception{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Enter the path: ");
      //Read the file name
      String path = bf.readLine();
      //pass the path to the file as parameter
      File file = new File(path);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNext()){
          System.out.println(scanner.nextLine());
      }

  }
}
