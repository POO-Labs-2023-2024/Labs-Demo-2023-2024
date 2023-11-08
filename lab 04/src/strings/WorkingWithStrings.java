package strings;

public class WorkingWithStrings {
    public static void main(String[] args) {
        String a = "hello";
        String b = a;

        a = "ceva";

        // String is immutable the change will not be reflected in b
        System.out.println(a);
        System.out.println(b);

        // Using String we use the String Pool optimization and immutability, but if we have this we create 100 instances
        // redundantly, as for every single time we do an operation on our string the object will be reinitialized with
        // a new instance as it is immutable.
        for (int i = 0; i < 100; i++) {
            // append to "a" the char '!'
        }

        // For the above case we should have used StringBuilder which creates only one instance and is not mutable, but
        // also does not use String Pool optimization
        StringBuilder sb = new StringBuilder("lightweight baby!!!\n");
        for (int i = 0; i < 100; i++) {
            sb.append("I love Ronnie Coleman");
            sb.append("Promit ca o sa completez feedback-ul :(");
        }

        // We also have StringBuffer, which is the same as StringBuilder but use thread-safe operations which also makes
        // it slower.
    }
}
