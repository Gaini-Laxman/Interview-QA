import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToArrayListExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);
        hashMap.put("David", 28);

        // Convert HashMap values to ArrayList
        List<Integer> list = new ArrayList<>(hashMap.values());

        // Display the ArrayList
        System.out.println("ArrayList: " + list); 
        list .forEach(System.out::println);
    }
}
