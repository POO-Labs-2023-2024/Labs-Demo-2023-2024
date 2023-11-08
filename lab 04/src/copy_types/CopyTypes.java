package copy_types;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a Main file and play with these values and check the object addresses using the debugger.
 * Check how and why things change, create an instance of CopyTypes and call deepCopy, then create another
 * and call shallowCopy. Check if I lied basically (spoiler, I didn't ;) ).
 */
public class CopyTypes {
    private int age;
    private String name;
    private Student student;
    private Grades studentGrades;
    private School studentSchool;
    private List<Integer> numsRef;
    private List<Integer> nums;
    private List<Student> students;
    private List<Student> studentsRef;

    public void normalCopies(int age, String name, Student student, List<Integer> nums, List<Student> students) {
        // With primitives, we pass by value so the external age and our age are independent. (primitives pass-by-value)
        this.age = age;
        // With an object that is *immutable* we can simply assign it here as it will create a new reference that will
        // be independent of the external one (remember immutable properties). (objects pass-by-reference & immutable)
        this.name = name;
        // Here is an object that is not immutable, in this case we simply copy the reference so if we change a property
        // for our internal object, the external object will be changed too. Here we simply point to the same
        // container for our data. (reference copy / pass-by-reference mutable object)
        this.student = student;
        // Here we have a list of objects that are immutable, when we do just this we are simply passing the reference
        // of the external object (reference copy) so we basically have copied the pointer to the heap memory location
        // of our object. An interesting fact is that even the argument is a copy of a reference of the external object
        // (remember how we pass by reference in function calls) so this is a copy of a copy of a reference
        this.numsRef = nums;
        this.studentsRef = students;
    }

    public void shallowCopy(Student student, List<Integer> nums, List<Student> students) {
        // Here we copy the references to our internal class, therefore if we make a change in our external Student object
        // that change will be reflected in our internal studentGrades and studentSchool too. (shallow copy)
        this.studentGrades = student.getGrades();
        this.studentSchool = student.getSchool();
        // We create a new reference to a list and the internal elements are copied to our new list. In this case, we only
        // have a new reference when we think of our List, but our internal elements are still copied shallowly! However,
        // since we have immutable elements (Integer is immutable) when we change one element in our external list, that
        // change will prompt the creation of a new instance, thus our internal and external list are independent
        // (shallow copy on lists with immutable objects)
        this.nums = new ArrayList<>(nums);
        // In this case, our objects are mutable, so the rules above apply for our list, but when we change the data of
        // one our objects (say we change the Grade of one of our students) that change will take effect here too, as
        // the copy of the elements is made shallowly. (shallow copy on lists with mutable objects)
        this.students = new ArrayList<>(students);
    }

    public void deepCopy(Student student, List<Student> students) {
        // Assume that the definition for our copy constructor works, in this case we define a new reference to our Grades
        // object, so if we change the external object, our internal one will not change (deep copy)
        this.studentGrades = new Grades(student.getGrades());
        // How do we do a deep copy on a mutable list? We start by creating a new instance of an ArrayList so our containers
        // are independent. (deep copy mutable list)
        this.students = new ArrayList<>();
        // We then create a new reference for each one of our objects
        for (Student s : students) {
            // We can use a copy constructor that copies the data how we need it
            this.students.add(new Student(s));
            // Or we can assign it like below. I prefer the approach above as the one below should happen in the copy
            // constructor more or less (remember you don't have to call getters inside your own class), this way we
            // really shorten our code (which is always a good thing).
            Student newStudent = new Student();
            newStudent.setGrades(s.getGrades());
            newStudent.setSchool(s.getSchool());
            this.students.add(newStudent);
        }
        // Remember that for our nums list we do not have to do this as our internal objects are immutable, so we achieve
        // independence.
    }


}
