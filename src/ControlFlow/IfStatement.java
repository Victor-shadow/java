package ControlFlow;

class IfStatement {
    public static void main(String[]args){
        String  str = "If statement";
        int i = 4;
        //if block
        if (i == 4){
            i++;
            System.out.println(str);
        }
        //executed by default
        System.out.println("i = " + i);
    }
}
