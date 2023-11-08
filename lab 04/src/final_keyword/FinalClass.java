package final_keyword;

/**
 * Cannot be extended!
 */
public final class FinalClass {
    // Final initialization can happen at declaration
    public static final int MAX_AGE = 30;
    // OR in initialization block (don't do this tho it looks weird)
    public final int minAge;

    {
        minAge = 20;
    }

    // OR in a constructor
    public final int averageAge;

    public FinalClass() {
        averageAge = 25;
    }

    public void finalArguments(final int x) {
        // This will not work as we cannot modify the argument anymore
        // x = 1;
    }

    public void finalVariables() {
        // Final primitives
        final int x = 4;

        // Cant do this (the variable is marked as read-only, since it is in the stack it's value cannot be changed)
        // x = 2;

        // Final references
        final Wolf wolf = new Wolf();

        // This does not work (the reference is final, so we cannot reassign another reference)
        // wolf = new Wolf()

        // This works (the content is not final as the object is not immutable, so we can reassign it)
        wolf.message = "ceva";
    }
}
