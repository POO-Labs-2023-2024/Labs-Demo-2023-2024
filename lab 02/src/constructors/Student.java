package constructors;

import this_demo.Group;

public class Student {
    private String name;
    public int averageGrade;

    public Student(Student student) {
        this.name = student.name;
        this.averageGrade = student.averageGrade;
    }

    // (1) constructor without parameters
    public Student() {
        name = "Unknown";
        averageGrade = 5;
    }

    // (2) constructor with two parameters; used to set the name and the grade
    public Student(String n, int avg) {
        name = n;
        averageGrade = avg;
    }

    // (3) constructor with one parameter; used to set only the name
    public Student(String n) {
        this(n, 5); // call the second constructor (2)
    }

    // Constructor that accepts another object
    public Student(Group group, String name, int grade) {
    }

    public void setName(String n) {
        name = n;
    }

    // (5) getter for the field 'name'
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
