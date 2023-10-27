package downcast;

class Animal {
    public void eat() {
        System.out.println("Animal eating");
    }
}

class Wolf extends Animal {
    public void howl() {
        System.out.println("Wolf howling");
    }

    @Override
    public void eat() {
        System.out.println("Wolf eating");
    }
}

class Snake extends Animal {
    public void bite() {
        System.out.println("Snake biting");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        // The reference (the left member of Animal a = new Wolf) is of type Animal, therefore the compiler will not
        // throw any errors (this is still upcasting). The instance (the right member) is of type Wolf, therefore at
        // runtime the methods called will be those overwritten by the current instance. If I had a method foo() defined
        // in Animal and if it was overwritten in Wolf, the wolf method would be called.
        // Is there a way we can call Animal foo method? Not really, Java does not allow it. We can do some hacks such as
        // calling super.foo() so that when I call Wolf's foo() the Animal's foo() will also run.
        animals[0] = new Wolf();    // Upcasting done automatically
        animals[1] = new Snake();   // Upcasting done automatically

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat(); // 1

            if (animals[i] instanceof Wolf) {
                ((Wolf)animals[i]).howl(); // 2
            }

            if (animals[i] instanceof Snake) {
                ((Snake)animals[i]).bite(); // 3
            }
        }
    }
}