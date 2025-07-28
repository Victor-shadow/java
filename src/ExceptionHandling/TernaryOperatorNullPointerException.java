package ExceptionHandling;

class TernaryOperatorNullPointerException {
    public static void main(String[]args){
        //Initialize string variable with null
        String s = null;
        String m = (s == null) ? "" : s.substring(0, 5);
        System.out.println(m);
        //Initialize String variable with a value
        s = "NullPointerException";
        m = (s == null) ? "" : s.substring(0, 5);
        System.out.println(m);
    }
}
//the ternary operator helps to check for null and helps avoid operations on null references
