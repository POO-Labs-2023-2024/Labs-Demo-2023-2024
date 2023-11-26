package internal_classes;

interface Engine {
    public int getFuelCapacity();
}

class Car {
    private String name = "Space Car";

    /**
     * Internal classes can have any type of access modifier (private, default, protected, public) as opposed to external
     * classes (default and public).
     */
    private class OttoEngine implements Engine {
        private int fuelCapacity;

        // If our class is private our constructors are also private
        public OttoEngine(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelCapacity() {
            // Watch how we use the external class name and "this" to access the external instance
            System.out.println(Car.this.name);
            return fuelCapacity;
        }
    }

    public Engine getEngine() {
        return () -> {
            System.out.println("ceva");
            return 11;
        }; // expresie lambda
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();

        // Only works if not private
//        Car.OttoEngine firstEngine = car.getEngine();

        // If we made OttoEngine private we would have to use our interface to access it (it becomes a member of the class,
        // so we have to use upcast).
//        Engine secondEngine = car.new OttoEngine(10);

//        System.out.println(firstEngine.getFuelCapacity());
//        System.out.println(secondEngine.getFuelCapacity());
    }
}
