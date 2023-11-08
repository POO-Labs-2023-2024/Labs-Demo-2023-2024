package copy_types;

public class Student {
    private Grades grades;
    private School school;

    public Student() {}

    public Student(Grades grades, School school) {
        this.grades = grades;
        this.school = school;
    }

    public Student(Student s) {
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
