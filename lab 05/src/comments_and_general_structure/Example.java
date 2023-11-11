package comments_and_general_structure;

import java.util.Objects;

/**
 * Describe shortly what the class purpose is. Btw, here is how you order your methods
 */
public class Example {
    // Please watch how I ordered the variables (Constants, static, objects, primitives). It's a personal preference but I think it looks clean.
    private static final int BIRTH_YEAR = 2003; // You can leave comments here if you really have to explain a variable (mostly not)
    private static String workType;
    private String bla;
    private Integer num;
    private int years;
    private float average; // Please don't pus empty lines in between variables, all class variables should be grouped.

    // Watch how I ordered the constructors.
    public Example() {}

    // Don't add JavaDoc's to constructors.
    public Example(String workType) {}

    public Example(String workType, Integer num) {}

    // Add all your personal methods after the constructors in any order you want.
    public void foo() {}

    /**
     * Describe the method's purpose, shortly. Always leave an empty line between this and the params. You can have
     * comments inside the method if you a complex flow, but in most of those cases you might need to break that method
     * into more methods.
     *
     * @param argv provides the commands to be executed
     * @param argc number of commands to be executed
     * @return success or fail if one of the commands fails
     */
    public String bar(String argv, int argc) { return "success"; }

    // Don't add JavaDocs to getters and setters.
    public static String getWorkType() {
        return workType;
    }

    public static void setWorkType(String workType) {
        Example.workType = workType;
    }

    public String getBla() {
        return bla;
    }

    public void setBla(String bla) {
        this.bla = bla;
    }

    // Don't add JavaDoc's to these
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return years == example.years && Float.compare(average, example.average) == 0 && Objects.equals(bla, example.bla) && Objects.equals(num, example.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bla, num, years, average);
    }
}
