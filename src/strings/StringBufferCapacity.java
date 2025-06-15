package strings;
//The capacity method returns the current capacity of the buffer. The default capacity of the buffer is 16
//If the number of characters increase from its current capacity: The capacity increases by:

public class StringBufferCapacity {
    public static void main(String[]args){
        StringBuffer sb = new StringBuffer();
        //Default 16
        System.out.println(sb.capacity());
        sb.append("Hello");

        //Now 16
        System.out.println(sb.capacity());
        sb.append("Java is a high-level oriented programming language");

        //(old capacity*2) + 2
        System.out.println(sb.capacity());


    }
}
