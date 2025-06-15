package strings;

public class stringBuilderMethods {
    public static void main(String[] args){
        //Create a new StringBuilder with initial content
        StringBuilder sb = new StringBuilder("Array of Characters ");
        System.out.println("Initial StringBuilder: " + sb);
        //Append a String to a StringBuilder
        sb.append("A String is ");
        System.out.println("After Append: " + sb);
        //Insert a substring at a specific position
        sb.insert(13, "Java");
        System.out.println("After Insert: " + sb);
        //Replace a Substring with another string
        sb.replace(0, 5, "The definition of Strings");
        System.out.println("After Replace: " + sb);
        //Delete a Substring from a StringBuilderClass
        sb.delete(3, 4);
        System.out.println("After Delete: " + sb);
        //Reverse the content of the StringBuilder
        sb.reverse();
        System.out.println("After Reverse: " + sb);
        //Get CurrentCapacity of StringBuilder
        int capacity = sb.capacity();
        System.out.println("Current capacity: " + capacity);
        //get Length of String Builder
        int length = sb.length();
        System.out.println("Current Length: " + length);
        //Access Character at specific index
        char charAt5 = sb.charAt(5);
        System.out.println("Character at index 5: " + charAt5);
        //Set a character at a specific index
        sb.setCharAt(5, 'X');
        System.out.println("After Char Set: " + sb);
        //Get a Substring from a StringBuilder
        String substring = sb.substring(2, 5);
        System.out.println("Substring(2 - 5): " + substring);
        //Find the index of a Specific Substring
        sb.reverse();//Reversing to the original order
        int indexOfString = sb.indexOf("Array");
        System.out.println("Index Of Array: " + indexOfString);
        //Delete a character at a specific index
        sb.deleteCharAt(3);
        System.out.println("After Delete char at: " + sb);
        //Convert StringBuilder to a String
        String result = sb.toString();
        System.out.println("Final String is: " + result);

    }
}
