package overloading_overriding;

public class Car {
    public void print() {
        System.out.println("Car");
    }

    public void init() {
        System.out.println("Car");
    }

    public void addGasoline() {
        // do something
    }
}

class Dacia extends Car {
    public void print() {
        System.out.println("Dacia");
    }

    public void init() {
        System.out.println("Dacia");
    }

    // Overriding (please add the decorator @Override)
    public void addGasoline() {
        // do something
    }

    // Overloading
    public void addGasoline(Integer gallons) {
        // do something
    }

    // Is this overloading? No, because if I call in my main method addGasoline() how will the compiler or JVM know
    // what method am I referring to? How will it know if I want to get as a return value void or String? It can't know,
    // so this is NOT overloading, hence the reason that a method's SIGNATURE does not contain the return type.
    public String addGasoline() {
        return "gas";
    }
}

