package Interfaces;

interface Serializable {
    //markable interface
}
//Define class that implements the markable interface
class Input implements  Serializable{
    public Input(){
        System.out.println("Input object created");
    }
}
//Define second class that does not implement interface
class Second {
    public Second(){
        System.out.println("Second object created");
    }
}

public class MarkableInterface{
    public static void main(String[]args){
        Input object = new Input();
        Second object2 = new Second();

        if (object instanceof Serializable){
            System.out.println("Input is Serializable");
        }
        else{
            System.out.println("Input not serializable");
        }
        if (object2 instanceof Serializable){
            System.out.println("Second is serializable");
        }
        else{
            System.out.println("Second not serializable");
        }

    }
}
