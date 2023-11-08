package static_keyword;

/**
 * Static is useful when we want to have data that is shared by all instances of an object. Static data is initialized
 * when the object is first called (when a method from this class is called or a reference is created). The data is stored
 * in a special place in the Metaspace alongside the class properties, this helps when we want to access the
 * static data as we are basically saying "hey I want class data, not instance data that is stored on the heap, and
 * since I know that you have class data already stored for all class objects somewhere, surely you have it's static
 * data too". This is how this data is readily available.
 */
public class Examples {
    static int age;
    static int minAge;
    // You can initialize here
    static int calls = 0;

    // or in a static block
    static {
        minAge = 4;
        int maxAge = 5;
    }

    public static void foo() {
        // I need to access static memory here since the method is loaded without an instance attached to it
        System.out.println(age);
        calls++;
    }

    public static void bar() {
        System.out.println("bar from parent");
    }

    // Even main is static since it's the ENTRYPOINT OF THE APPLICATION
    public static void main(String[] args) {
        System.out.println(Examples.age);
        System.out.println(Examples.minAge);
        System.out.println(Examples.calls);

        Examples ex1 = new Examples();
        ex1.foo(); // not correct since we are calling a static method on a reference, not an instance

        Examples ex2 = new Examples();
        Examples.foo(); // this is the same as the one above but much better as we call it from the reference/class

        // These are both equal since this attribute is part of the class, not instance so the variables are shared
        // among the two of them
        System.out.println(ex1.calls);
        System.out.println(ex2.calls);
    }
}
