package Operators;

class ShiftOperators {
    public static void main(String[] args){
        int a = 10;
        //Using Left shift
        System.out.println("a<<1 " + (a << 1));
        //Using Right Shift
        System.out.println("a>>1 " + (a >> 1));
        //Using Unsigned Right Shift
        System.out.println("a>>>1 " + (a >>> 1));
    }
}
