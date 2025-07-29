package InputOutput;
import java.io.*;
public class fileWriter {

    public static void main(String[]args) throws IOException{
        //Writer to output in the console
        Writer w = new PrintWriter(System.out);
        System.out.println("Example 1: append(char)");

        //Appending characters
        w.append('F');
        w.append('I');
        w.append('L');
        w.append('E');
        w.append('W');
        w.append('R');
        w.append('I');
        w.append('T');
        w.append('E');
        w.append('R');
        w.flush();

        System.out.println();
        System.out.println("Example 2: append(charSequence)");
        CharSequence t = "Hello, World";
        //append entire char Sequence
        w.append(t);
        w.flush();

        System.out.println();

        System.out.println("Example 3: append(charSequence, start, end)");

        //append substring Hello
        w.append(t, 0, 5);
        w.append(" ");
        //append substring
        w.append(t, 7, 12);
        w.flush();

        System.out.println();
        //close the writer
        w.close();


    }

}
