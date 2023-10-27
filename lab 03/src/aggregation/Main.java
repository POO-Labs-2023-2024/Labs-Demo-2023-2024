package aggregation;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("street 1", 1);
        AggregateEmployee e = new AggregateEmployee(1, "Tim", address);
        System.out.println(e);
    }
}
