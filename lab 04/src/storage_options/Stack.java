package storage_options;

/**
 * In this example, the local variables a, b, sum, x, y, and result are stored in the stack. Primitives and references
 * are stored in the stack as well as arguments since they are copied on stack and passed to the function call.
 */
public class Stack {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        System.out.println("Sum: " + sum);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
}
