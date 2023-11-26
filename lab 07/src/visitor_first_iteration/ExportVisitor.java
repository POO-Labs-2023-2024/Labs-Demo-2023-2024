package visitor_first_iteration;

import java.util.ArrayList;
import java.util.List;

/**
 * First step basic: we prefer this to respect SOLID principles. Instead of adding a lot of external weird methods that
 * might not belong in the classes we simply add an external class.
 */
public class ExportVisitor {
    void doForCity(City c) {}

    void doForIndustry(Industry f) {}

    void doForSightSeeing(SightSeeing ss) {}
}

class Main {
    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        ExportVisitor exportVisitor = new ExportVisitor();

        // NOT GOOD: instance of & specialised methods
        for (Node node: nodes) {
            if (node instanceof City) {
                exportVisitor.doForCity((City) node);
            } else if (node instanceof Industry) {
                exportVisitor.doForIndustry((Industry) node);
            } else if (node instanceof SightSeeing) {
                exportVisitor.doForSightSeeing((SightSeeing) node);
            }
        }
    }
}