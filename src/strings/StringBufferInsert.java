package strings;
//The insert method inserts the given string at the given position
//Syntax: StringBuffer insert(int index, String str)
//StringBuffer insert(int index, char ch)
public class StringBufferInsert {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");
        System.out.println(sb);
    }
}
