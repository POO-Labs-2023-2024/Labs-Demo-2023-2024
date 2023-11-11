package abstract_classes;

public class ChildClass extends AbstractClass {
    /**
     * Let's try something, what JavaDoc will be shown when we hover on the method?
     * As a rule, it's generally better to implement the JavaDoc only on the abstract method (or general method when
     * it comes to interfaces). For example, a "push" method that is abstract will work basically the same for everyone
     * that implements it (only the implementation differs, but the result is the same), for this case it makes sense
     * to only add the JavaDoc in the abstract method. However, if we have some different specialized methods that are
     * kind of different from child to child, an example would be the abstract method "action". Each animal will perform
     * a different action (one will growl, another will bite, another will walk away etc.), for this specific scenario it
     * makes sense to actually add the JavaDoc to the child too, as you will describe exactly what it does for that
     * specific implementation.
     */
    @Override
    public void bar() {
        System.out.println("Implemented in child");
    }
}
