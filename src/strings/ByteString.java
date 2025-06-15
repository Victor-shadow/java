package strings;

class ByteString {
    public static void main(String[] args){
        //Creating Byte ASCII array
        byte ascii[] = {71, 70, 71};

        //Creating string using byte array
        String firstString = new String(ascii);

        System.out.println(firstString);

        //Create String using byte array with Start Index to End Index
        String secondString = new String(ascii, 1, 2);
        System.out.println(secondString);


    }
}
