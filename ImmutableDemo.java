// Employee class (Immutable)
public final class Employee {
    final String pancardNumber;

    public Employee(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }
}

// ImmutableDemo class to demonstrate usage
public class ImmutableDemo {
    public static void main(String[] args) {
        Employee e = new Employee("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println("Pancard Number: " + s1);
    }
}
