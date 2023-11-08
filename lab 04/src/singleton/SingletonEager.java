package singleton;

/**
 * Wasteful resource usage as we initialize it even if we don't need it. If it holds small data, it's ok to use this.
 */
public class SingletonEager {
    private final static SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }
}
