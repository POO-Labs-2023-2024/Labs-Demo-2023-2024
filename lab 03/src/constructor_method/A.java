package constructor_method;

public class A {
    protected int a = 10;

    public A() {
        System.out.println("constructor_method.A::constructor");
        method();
    }

    public void method() {
        System.out.println("constructor_method.A::method(): a = " + a);
    }
}
