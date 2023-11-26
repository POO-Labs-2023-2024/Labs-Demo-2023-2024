package visitor_second_iteration;

/**
 *
 * Second iteration: General methods that use overloading
 */
public class Exporter {
    void export(Node node) { System.out.println("node"); }

    void export(City city) {
        System.out.println("city");
    }

    void export(Industry industry) {
        System.out.println("industry");
    }

    void export(SightSeeing sightSeeing) {
        System.out.println("sightseeing");
    }
}

class Main {
    public static void main(String[] args) {
        Exporter exporter = new Exporter();

        Node city = new City();

        // OH NO, static binding caused some issues... double dispatch is needed.
        // Precisely, overloading is done at compile-time (overriding at run-time). Overriding is done at run-time because
        // we cannot know the instance of our object (e.g. an array list of animals can we have 50 different instances, which
        // is not very efficient to check and store at compile-time, this also allows inheritance behaviors). Overloading
        // is done at compile-time because anything compiled is faster, and we simply check the type and number of parameters,
        // so it's easy to do. But, since overloading is done at compile-time, in our specific case the export method will
        // use the implementation that contains the reference (which is Node) because that is known at compile time. The
        // reason for this is that if we add a new child (a new Node subtype) we cannot know for certain if there is a
        // method that uses that as a parameter, so it falls back to a safety mechanism by always using references, plus
        // those are available at compile time.
        exporter.export(city);
    }
}
