package interfaces;

/**
 * A class with only abstract methods is an interface lol.
 */
public interface Interface {
    int age = 5; // all variables are public static final by default

    // You don't need to put abstract, by default all methods are abstract.
    public void foo();

    // You don't have to add public, by default all methods are public
    void bar();
}
