package InputOutput;
import java.io.*;
public class fileWriter {


    private static Writer w;
    private static Writer w1;

    public static void main(String[]args) throws IOException{
        //Writer to output in the console
        Writer w1 = new PrintWriter(System.out);
        System.out.println("Example 1: append(char)");

        //Appending characters
        w1.append('F');
        w1.append('I');
        w1.append('L');
        w1.append('E');
        w1.append('W');
        w1.append('R');
        w1.append('I');
        w1.append('T');
        w1.append('E');
        w1.append('R');
        w1.flush();

        System.out.println();
        System.out.println("Example 2: append(charSequence)");
        CharSequence t = "Hello, World";
        //append entire char Sequence
        w1.append(t);
        w1.flush();

        System.out.println();

        System.out.println("Example 3: append(charSequence, start, end)");

        //append substring Hello
        w1.append(t, 0, 5);
        w1.append(" ");
        //append substring
        w1.append(t, 7, 12);
        w1.flush();

        System.out.println();
        //close the writer
        w.close();


    }

}
