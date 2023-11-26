package anonymous_classes;

interface Engine {
    public int getFuelCapacity();
}

class Car {
    class OttoEngine implements Engine {
        private int fuelCapacity;

        public OttoEngine(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelCapacity() {
            return fuelCapacity;
        }
    }

    public Engine getEngine(int fuelCapacity) {
        // Anonymous class, cannot implement multiple
        return new Engine () {
            private int fuelCapacity = 11;

            // Anonymous classes cannot have constructors, they are constructed with the default constructor
//            public Engine() {
//
//            }

            public int getFuelCapacity() {
                return fuelCapacity;
            }
        };
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();

        Car.OttoEngine firstEngine = car.getEngine();
        Car.OttoEngine secondEngine = car.new OttoEngine(10);

        System.out.println(firstEngine.getFuelCapacity());
        System.out.println(secondEngine.getFuelCapacity());
    }
}
