package strings;

public class Substring {
    public static void main(String[]args){
        //Character Array
        char characters[] = {'N', 'A', 'M', 'E'};

        //Creating new String using Character Array
        String firstString = new String(characters);
        //Creating new String using another String
        String secondString = new String(firstString);

        System.out.println(firstString);
        System.out.println(secondString);
    }
}
