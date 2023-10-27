package constructor_method;

public class B extends A {
    protected int a = 20;

    public B() {
        super();
        System.out.println("constructor_method.B::constructor");
    }

    @Override
    public void method() {
        System.out.println("constructor_method.B::method() a = " + a);
    }
}
