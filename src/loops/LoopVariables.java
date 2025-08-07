package loops;

class LoopVariables {
    public static void main(String[]args){
        for (int i = 0; i < 5; i++){
            if (i == 2){
                //modify the loop variable
                //skips the next iteration
                i++;
            }
            System.out.println();
        }
    }
}
