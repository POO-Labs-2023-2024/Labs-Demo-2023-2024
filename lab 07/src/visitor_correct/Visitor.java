package visitor_correct;

/**
 * This is the same as before, external class that deals with the logic.
 */
public interface Visitor {
    void visit(JsonElement jsonElement);

    void visit(XmlElement xmlElement);
}
