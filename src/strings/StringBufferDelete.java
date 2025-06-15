package strings;

//Delete method deletes a string from a specified position(Begin index) to end index(-1)
//Syntax:StringBuffer delete(int startIndex, int endIndex)
//StringBuffer deleteCharAt(int loc)
public class StringBufferDelete {
    public static void main(String[]args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);


    }
}
