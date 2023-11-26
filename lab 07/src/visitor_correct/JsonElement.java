package visitor_correct;

public class JsonElement extends Element {
    @Override
    public void accept(Visitor v) {
        // We want to visit a JsonElement, so we pass this, now the overload is done correctly at compile time.
        // We first call accept and then visit with "this", which is why we call it double dispatch. Single dispatch is
        // a method call that will be applied on the object that calls it (the object's type before the "." of the method,
        // e.g. v.visit -> the dispatch is done on "v" which is Visitor type).
        v.visit(this);
    }
}
