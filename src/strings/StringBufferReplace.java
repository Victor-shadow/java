package strings;
//The replace method replaces the given string from the specified Begin index to End index(-1)
//Syntax: //StringBuffer replace(int startIndex, int endIndex, String str)
public class StringBufferReplace {
    public static void main(String[]args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
    }
}
