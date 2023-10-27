package equals;

import java.util.Objects;

public class Mercedes {
    private int year;
    private String classType;
    private String owner;

    @Override
    public boolean equals(Object o) {
        // Say we have Mercedes a = new Mercedes()
        // When we do a.equals(a) it should return true, this is what the line below does, it compares the INSTANCE
        if (this == o) return true;

        // Say we have Mercedes b = null, it should return false
        // Or say we have Cat cat = new Cat(), since the classes don't match it should return false
        // Those two cases are followed bellow
        if (o == null || getClass() != o.getClass()) return false;

        // Now that we established that the current instance is of the same type as this object and it's not null we can
        // cast it to a Mercedes object so that we can compare each attribute. The cast is helpful as it tells the compiler
        // how to map the object's memory and how to use
        Mercedes mercedes = (Mercedes) o;

        // Here is the comparison between the attributes
        return year == mercedes.year && Objects.equals(classType, mercedes.classType) && Objects.equals(owner, mercedes.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, classType, owner);
    }
}
