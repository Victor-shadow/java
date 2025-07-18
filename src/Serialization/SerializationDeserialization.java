package Serialization;
import java.io.*;

class TransientStatic implements Serializable{
    private  static final long serialVersionUID = 129348938L;
    transient int a;
    static int b;
    String name;
    int age;

    public TransientStatic(String name, int age, int a, int b){
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }
}
public class SerializationDeserialization{
    public static  void printData(TransientStatic object1){
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }
    public static void main(String[]args){
        TransientStatic obj = new TransientStatic("ab", 20, 2, 1000);
        String filename = "file.txt";

        //Serialization
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);
            out.close();
            file.close();
            System.out.println("Object has been serialized\nData before deserialization");
            printData(obj);
            //Change Static variable b
            obj.b = 2000;
        } catch (IOException ex){
            System.out.println("IOException caught");
        }
        obj = null;
        //Deserialization
        try{
            //Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in =new ObjectInputStream(file);
            obj = (TransientStatic) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been Deserialized\nData after Deserialization");
            printData(obj);
        } catch (IOException ex){
            System.out.println("IOException caught");
        } catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException found");
        }
    }
}