package immutable;

public class MutableProblems {
    public boolean validateSingIn(String username) {
        if (username.contains("',_-!@#$%^&*()")) {
            System.out.println("caught you mf");
            return false;
        }

        // Call some other methods here, maybe parse the password or something

        // Well, because string is immutable we know that it's value never changed, but if we passed something else that
        // was mutable how would we be sure that it did not change??? The user that called validateSignIn still has a
        // reference to "username" so maybe after the first check is done, he changes the username to something invalid,
        // and we pass it as being valid which is wrong. This is why immutable is valuable, we have certainty.
        return true;
    }
}
