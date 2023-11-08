package storage_options;

/**
 * In this example, the objects person1 and person2 are allocated on the heap. Objects are stored in the heap, Java works
 * a lot on the heap, almost everything is in the heap.
 */
public class Heap {
    public static void main(String[] args) {
        // Creating objects that are allocated on the heap
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

