package Methods;

public class AccessorAndMutatorMethod {
    //Private fields(variables) num and n
    private int num;
    private String n;

    //Accessor and Getter methods
    public int getNum(){
        return num;
    }
    public String getN(){
        return n;
    }
    //Mutator and Setter Methods
    public void setNum(int num) {
        this.num = num;
    }

    public void setN(String n) {
        this.n = n;
    }
    //Other Methods
    public void printOutput(){
        System.out.println("Number: " + num);
        System.out.println("String: " + n);
    }
    //Driver Method
    public static void main(String[]args){
        AccessorAndMutatorMethod object = new AccessorAndMutatorMethod();
        object.setNum(12345);
        object.setN("A String is an Array of Characters");
        object.printOutput();
    }
}
