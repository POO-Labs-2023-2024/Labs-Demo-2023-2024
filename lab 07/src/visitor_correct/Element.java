package visitor_correct;

public abstract class Element {
    // By using accept, we can pass "this" which is established at compile time as the current instance (which is the
    // current class always in Java, exception being JavaScript so make sure you know your language before applying Visitor).
    public abstract void accept(Visitor v);
}
