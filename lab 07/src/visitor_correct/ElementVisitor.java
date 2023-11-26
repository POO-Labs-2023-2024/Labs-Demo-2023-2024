package visitor_correct;

/**
 * You can add the implementation here, respecting SOLID. You can also have multiple visitors with different behaviours.
 */
public class ElementVisitor implements Visitor {
    public void visit(XmlElement xe) {
        System.out.println("process XML");
    }

    public void visit(JsonElement xe) {
        System.out.println("process JSON");
    }
}
