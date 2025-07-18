package Serialization;
import java.io.*;

class Serialization implements Serializable {
    public int a;
    public String s;

    public  Serialization(int a, String s){
        this.a = a;
        this.s = s;
    }
}
public class Serializer{
    public static void main(String[]args){
        Serialization object = new Serialization(1, "Conversion of an object into a byte stream");
        String filename = "file.ser";

        //Serialization
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException ex){
            System.out.println("IOException is caught");
        }
        Serialization object1 = null;

        //Deserialization
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (Serialization) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.s);
        } catch (IOException ex){
            System.out.println("IOException caught");
        } catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException caught");
        }
    }
}