package visitor_correct;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {
    List<Element> elements = new ArrayList<>();

    public void accept(Visitor v) {
        for (Element e : elements) {
            e.accept(v);
        }
    }
}
