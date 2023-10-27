package references;

import constructors.Student;

public class Main {
    static void changeReference(Student st) {
        st = new Student("Bob", 10);
    }

    static void changeObject(Student st) {
        st.averageGrade = 10;
    }

    public static void main(String[] args) {
        // First demo
        Student s1 = new Student("Bob", 6);

        Student s2 = s1;
        s2.averageGrade = 10;

        System.out.println(s1.averageGrade);

        // Second demo
        Student s = new Student("Alice", 5);
        changeReference(s);                 // apel (1)
        System.out.println(s.getName());    // "Alice"

        changeObject(s);                    // apel (2)
        System.out.println(s.averageGrade); // "10"
    }
}
