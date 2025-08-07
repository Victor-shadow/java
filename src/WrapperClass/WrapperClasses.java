package WrapperClass;

class WrapperClasses {
    public static void main(String[]args){
        //byte data type
        byte a = 1;
        //wrap around byte object(use valueOf autoboxing)
        Byte byteObj = Byte.valueOf(a);
        //int data type
        int b = 10;
        //wrap around int object(use valueOf autoboxing)
        Integer intObj = Integer.valueOf(b);
        //float data type
        float c = 100.0f;
        //wrap around float object(use valueOf autoboxing)
        Float floatObj = Float.valueOf(c);
        //double data type
        double d = 1000.0;
        //wrap around double object(use valueOf autoboxing)
        Double doubleObj = Double.valueOf(d);
        //char data type
        char e = 'c';
        //wrap around Character object(use valueOf autoboxing)
        Character charObj =  e;

        //print the values from the objects
        System.out.println("Values of wrapper objects(printing as objects)");
        System.out.println("\nByte object byteobj: " + byteObj);
        System.out.println("\nInteger object intobj: " + intObj);
        System.out.println("\nFloat object floatobj: " + floatObj);
        System.out.println("\nDouble object doubleobj: " + doubleObj);
        System.out.println("\nCharacter object charobj: " + charObj);
        //objects to data types unwrapping objects to primitive data types
        byte by = byteObj;
        int i = intObj;
        float f = floatObj;
        double dd = doubleObj;
        char cc = charObj;
        //print the values from the data types
        System.out.println("\nUnwrapped values(printing as data types)");
        System.out.println("\nbyte value, b: " + by);
        System.out.println("\nint value i: " + i);
        System.out.println("\nfloat value f: " + f);
        System.out.println("\ndouble value dd: " + dd);
        System.out.println("\nchar value cc: " + cc);

    }
}
