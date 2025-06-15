package strings;
//Syntax: StringBuffer append(String str)
//StringBuffer append(int num)
public class StringBufferAppend {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("hello ");
        //The append method concatenates the given argument with the string
        sb.append("java");
        System.out.println(sb);

    }
}
