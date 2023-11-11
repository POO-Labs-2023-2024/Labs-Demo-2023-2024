package overloading_overriding;

public class Main {
    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Dacia();
        Dacia c = new Dacia();
        Car d = null;

        a.print(); // afișează Car
        b.print(); // afișează Dacia
        c.print(); // afișează dacia
        d.print(); // aruncă NullPointerException

        a.addGasoline();
    }
}
