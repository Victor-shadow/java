package Variables;

public class BlockScope {
    public static void main(String[] args){
        //Block Level Scope
        {
            //Variable only has scope within these brackets
            String variableName = "String in a Block Scope";
            System.out.println(variableName);
        }
        //Uncommenting this line causes an error
        //System.out.println(variableName); //out of scope


    }
}
