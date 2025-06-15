package strings;

public class stringBuilder {
    public static void main(String[] args){
        //Create a new string builder with initial values
        StringBuilder sb = new StringBuilder("A String ");
        System.out.println("Initial String Builder: " + sb);
        //Append a String to the StringBuilder class
        sb.append("Is an object that stores a sequence of characters");
        System.out.println("After Append: " + sb);
    }
}
