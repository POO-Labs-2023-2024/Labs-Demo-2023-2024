package static_keyword;

public class StaticOverriding extends Examples {
    // @Override Interesting error here, try to uncomment this
    public static void bar() {
        System.out.println("bar from child");
    }

    public static void main(String[] args) {
        // Static methods look at the object's reference, not instance. This explains the behaviour below.

        StaticOverriding a = new StaticOverriding();
        a.bar(); // please call it like this: StaticOverriding.bar() to emphasize the point above
        Examples b = new StaticOverriding();
        b.bar();
        Examples c = new Examples();
        c.bar();
    }
}
