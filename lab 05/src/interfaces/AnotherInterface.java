package interfaces;

/**
 * When an interface implements another interface we have to use the keyword "extends". Just like before, only the final child
 * will have to implement all abstract methods.
 */
public interface AnotherInterface extends Interface {
    void something();
}
