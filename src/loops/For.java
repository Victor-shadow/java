package loops;
class For {
    public static void main(String[]args){
        int s = 0;
        //for loop begins and runs
        //till x <= 20;
        for (int x = 1; x <= 20; x++){
            s = s + x;
        }
        System.out.println("Sum: " + s);
    }
}
