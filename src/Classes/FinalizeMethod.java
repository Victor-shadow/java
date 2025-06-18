package Classes;

public class FinalizeMethod implements AutoCloseable {
    public static void main(String[] args) {
        try (FinalizeMethod object = new FinalizeMethod()) {
            System.out.println(object.hashCode());
        }
        System.out.println("end");
    }

    @Override
    public void close() {
        System.out.println("Resource cleanup done");
    }
}