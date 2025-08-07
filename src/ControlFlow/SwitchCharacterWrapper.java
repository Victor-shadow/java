package ControlFlow;

import java.io.BufferedReader;

public class SwitchCharacterWrapper {
    public static void main(String []args){
        Character ch = 'c';
        switch (ch){
            case 'a':
                System.out.println("This is a");
                break;
            case 'c':
                System.out.println("This is c");
                break;
            default:
                System.out.println("Character not matched");
        }
    }
}
