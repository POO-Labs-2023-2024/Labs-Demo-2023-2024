package storage_options;

/**
 * In this example, the class metadata for the dynamically loaded class is stored in Metaspace. Metaspace stores class
 * metadata, including class definitions and method bytecode. Also, it includes static code declarations.
 */
public class Metaspace {
    public static void main(String[] args) {
        // Creating and loading a custom class at runtime
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> customClass = myClassLoader.loadClass("CustomClass");
    }
}

class MyClassLoader extends ClassLoader {
    public Class<?> loadClass(String className) {
        // Load and define the custom class at runtime
        byte[] bytecode = new byte[] { 1, 2, 3, 4, 5 }; // Load bytecode from somewhere
        return defineClass(className, bytecode, 0, bytecode.length);
    }
}
