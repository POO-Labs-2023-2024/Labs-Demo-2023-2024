package abstract_classes;

/**
 * If you want abstract methods (without a body), you need an abstract class. These can have both implemented methods
 * and unimplemented methods.
 */
public abstract class AbstractClass {
    public void foo() {
        System.out.println("already implemented");
    }

    /**
     * Any class that extends this class will have to implement all abstract methods
     */
    public abstract void bar();
}
