package Arrays;

public class DefaultArrayValues {
    public static void main(String[] args) {
        System.out.println("String Array Default Values: ");
        String str[] = new String[5];
        for (String s : str) {
            System.out.println(s + " ");

            System.out.println("\n\nInteger Array default values: ");
            int num[] = new int[5];
            for (int val : num)
                System.out.println(val + " ");

            System.out.println("\n\nDouble Array default values: ");
            double dnum[] = new double[5];
            for (double val : dnum)
                System.out.println(val + "");

            System.out.println("\n\nBoolean Array default values: ");
            boolean bnum[] = new boolean[5];
            for (boolean val : bnum)
                System.out.print(val + " ");

            System.out.println("\n\nReference Array default values: ");
            DefaultArrayValues ademo[] = new DefaultArrayValues[5];
            for (DefaultArrayValues val : ademo)
                System.out.println(val + "");
        }
    }
}
