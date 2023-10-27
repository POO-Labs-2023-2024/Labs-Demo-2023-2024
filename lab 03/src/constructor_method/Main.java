package constructor_method;

public class Main {
    public static void main(String[] args) {
        // This demo will help you understand how objects are constructed, try to run it yourself, but before that try
        // to guess what the order of the prints will be and try to understand any weird behaviours
        // HINT: use the debugger and try to think how an object is constructed

        B b = new B();
        System.out.println("Object created...!");
        b.method();
    }
}