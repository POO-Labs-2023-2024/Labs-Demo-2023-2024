package this_demo;

import constructors.Student;

public class Group {
    private int numberStudents;
    private Student[] students;

    public Group () {
        numberStudents = 0;
        students = new Student[10];
    }

    public boolean addStudent(String name, int grade) {
        if (numberStudents < students.length) {
            // You can insert the current instance (this) as an argument
            students[numberStudents++] = new Student(this, name, grade); // (1)
            return true;
        }

        return false;
    }
}