package Operators;

class AssignmentOperator {
    //Main Function
    public static void main(String[] args){
        //Assignment Operators
        int f = 10;
        System.out.println("f += 3" + (f += 3));
        System.out.println("f -= 2" + (f -= 2));
        System.out.println("f *= 4" + (f *= 4));
        System.out.println("f /= 3" + (f /= 3));
        System.out.println("f %= 2" + (f %= 2));
        System.out.println("f &= 0b1010" + (f &= 0b1010));
        System.out.println("f |= 0b1100" + (f |= 0b1100));
        System.out.println("f ^= 0b1010" +(f ^= 0b1010));
        System.out.println("f <<= 2" + (f <<= 2));
        System.out.println("f >>= 1" + (f >>= 1));
        System.out.println("f >>>= 1" + (f >>>= 1));
    }
}
