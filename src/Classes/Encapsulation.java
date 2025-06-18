package Classes;

class MainEncapsulation {
    private String name;
    //Getter and Setter methods for name

    //Getter method to display data
    public String getName() {
        return name;
    }
    //setter method to modify data
    public void setName(String name){
        this.name = name;
    }
}
public class Encapsulation{
    public static void main(String[]args){
        MainEncapsulation object = new MainEncapsulation();
        object.setName("Encapsulation refers to binding of data members and methods into a single unit");
        System.out.println("Name => " + object.getName());
    }
}
