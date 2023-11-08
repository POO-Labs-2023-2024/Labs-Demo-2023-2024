package sorting_methods;

/**
 * When we make a class sortable we have to implement the interface Comparable, hence we need to define compareTo.
 * Attention, we have to specify the other types we want to compare to in "<>". If we left it without brackets, we
 * would compare to an Object (a.k.a. anything). If we want to compare only with other students we have to specify
 * that (like bellow).
 */
public class Student implements Comparable<Student> {
    private int grades;
    private String name;

    public Student(int grades, String name) {
        this.grades = grades;
        this.name = name;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Define it however you want.
     *
     * @param o the object to be compared.
     * @return 0 if equals, -1 if less than and 1 if bigger than
     */
    @Override
    public int compareTo(Student o) {
        return Integer.compare(grades, o.grades);
    }
}
