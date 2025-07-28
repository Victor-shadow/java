package ExceptionHandling;

class ExceptionToString {
    //Main Method
    public static void main(String[]args ) throws Exception{
        try {
            //divide numbers
            int a = 4, b = 0;
            int c = a/b;
        }
        catch (Throwable e){
            //print use toString() method
            System.out.println("Exception: " + e.toString());
        }
    }
}
