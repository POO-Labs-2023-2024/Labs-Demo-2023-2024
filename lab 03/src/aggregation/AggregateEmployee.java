package aggregation;

public class AggregateEmployee {
    private final int id;
    private final String name;
    private final Address address;

    // Address is passed to this object so it will still exist after it is deleted
    public AggregateEmployee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AggregateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}