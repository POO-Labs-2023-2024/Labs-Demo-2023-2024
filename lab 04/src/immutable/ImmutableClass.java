package immutable;

/**
 * The contents of the class are all marked as final so the class is immutable. The contents of the class cannot be
 * changed in any way so if we need to change something, we have to create a new instance. Best example for this is the
 * class String. When we create this example <<String a = "wow">> and we then do this <<a = "not so wow">> we are actually
 * creating a new object in the String Pool as String is immutable, and we cannot modify it's content (think of it as the
 * class String holds an attribute final stringValue, so we cannot change it). Being immutable offers security and
 * predictability. If we pass an instance of ImmutableClass to any other class we 100% know that it's content will never
 * change at any time.
 */
public class ImmutableClass {
    private final String message;
    private final int age;

    public ImmutableClass(String message, int age) {
        this.message = message;
        this.age = age;
    }

    public final void giveMeSomething(int x) {
        System.out.println("My precious variable x is: " + x);
    }
}
