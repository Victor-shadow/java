package strings;

class ImmutableString {
    public static void main(String[] args){
        String s = "James";
        //Concat method appends the String to the end
        s.concat("Gosling");
        //This will print James since strings are immutable
        System.out.println(s);
    }
}
