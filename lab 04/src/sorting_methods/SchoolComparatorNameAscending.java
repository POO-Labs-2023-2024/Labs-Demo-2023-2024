package sorting_methods;

import java.util.Comparator;

/**
 * Custom class used for comparisons. We prefer the other approach with Comparable as we don't pollute the project with
 * comparators. However, if we need more than one standard comparator, this approach works.
 */
public class SchoolComparatorNameAscending implements Comparator<School> {
    @Override
    public int compare(School o1, School o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
