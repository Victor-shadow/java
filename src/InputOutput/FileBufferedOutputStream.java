package InputOutput;
import java.io.*;
class FileBufferedOutputStream {
  public static void main(String[]args) throws Exception{
      FileOutputStream fout = new FileOutputStream("buffer.txt");
      //create BufferedOutputStream object
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      //illustrate write() method
      for (int i = 65; i < 75; i++){
          bout.write(i);
      }
      byte[] b = {75, 76, 77, 78, 79, 80};
      bout.write(b);
      //illustrate flush() method
      bout.flush();
      //illustrate close() method
      bout.close();
      fout.close();

  }

}
