package sorting_methods;

import java.util.*;

/**
 * Please look inside all classes for some explanations.
 */
public class Sort {
    private final List<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
    private final List<String> listNames = new ArrayList<>(Arrays.asList("Ma", "Omoara", "Tutorialu", "Asta"));
    private final List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(7, "Marean"),
            new Student(9, "Eugenia"),
            new Student(7, "Gigi Lamorozzo")
    ));
    private final List<School> schools = new ArrayList<>(Arrays.asList(
            new School("Scoala vietii"),
            new School("Harvard")
    ));

    public void sortingMethods() {
        // Using Collections, by default uses ascending sort. This works on known types.
        Collections.sort(list);

        // This works only if we make the class Student implement the interface "Comparable"
        Collections.sort(students);

        // This works too
        Collections.sort(schools, new SchoolComparatorNameAscending());

        // Or we can use this (works as it has known type)
        list.sort(Collections.reverseOrder());

        // But also this
        schools.sort(new SchoolComparatorNameAscending());

        // Some syntactic sugar
        listNames.sort(String.CASE_INSENSITIVE_ORDER);

        // Custom sort function
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getGrades(), o2.getGrades());
            }
        });

        // Custom sort using lambda functions
        students.sort((o1, o2) -> Integer.compare(o1.getGrades(), o2.getGrades()));

        // Custom sort using lambda functions (even better using functional programming)
        students.sort(Comparator.comparingInt(Student::getGrades));

    }
}
