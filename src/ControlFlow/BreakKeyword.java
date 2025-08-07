package ControlFlow;

class BreakKeyword {
    public static void main(String[]args){
        for (int i = 0; i < 3; i++){
            one: { //label one
            two: {  //label two
                three:{  //label three
                System.out.println("i=" + i);
                if (i == 0){
                    break one;//break to label one
                }
                if (i == 1){
                    break two; //break to label two
                }
                if (i == 2){
                    break three; //break to label three
                }
                System.out.println("after label three");
                }
                System.out.println("after label two");
            }
            System.out.println("after label one");
            }
        }

    }
}
//when i = 0, the first if statement succeeds and causes a break to label one and then prints the statement
//When i = 1, the second if statement succeeds and causes a break to label two and then prints the statement
//when i = 2, the third if statement succeeds and causes a break to label three and then prints all the three statements