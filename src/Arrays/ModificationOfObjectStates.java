package Arrays;
//Changing of values in a final object
public class ModificationOfObjectStates {
    int p =20;
    public static void main(String[]args){
        final ModificationOfObjectStates q = new ModificationOfObjectStates();
        q.p = 50;
        System.out.println(q.p);
    }
}
