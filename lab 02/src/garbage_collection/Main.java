package garbage_collection;

public class Main {
    public static void foo() {
        Float value = 3.14f;
    }

    public static void main(String[] args) {
        Integer integer = Integer.valueOf(5);

        System.out.println(integer);

        // GC triggered since reference does not exist anymore
        integer = null;

        {
            Integer integer1 = 3;
        }
        // Garbage collection triggered again after scope was changed

        foo();
        // Garbage collection triggered again after method ends everything inside is deallocated

        // Trigger gc manually
        System.gc();
    }
}
