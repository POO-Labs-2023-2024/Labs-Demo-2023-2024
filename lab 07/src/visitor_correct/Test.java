package visitor_correct;

public class Test {
    public static void main(String[] args) {
        Visitor v = new ElementVisitor();

        Document d = new Document();
        d.elements.add(new JsonElement());
        d.elements.add(new XmlElement());
        d.elements.add(new JsonElement());

        d.accept(v);
    }
}
