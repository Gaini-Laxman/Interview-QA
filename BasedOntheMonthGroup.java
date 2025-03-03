import java.util.*;
import java.util.stream.Collectors;

public class BasedOntheMonthGroup{
    public static void main(String[] args) {
        String[] arr = {"jan", "feb", "march", "april", "may", "june"};

        String output = Arrays.stream(arr)
            .collect(Collectors.groupingBy(
                s -> s.substring(0, 1), // Group by the first letter
                LinkedHashMap::new,     // Preserve insertion order
                Collectors.toList()
            ))
            .entrySet()
            .stream()
            .map(entry -> entry.getKey() + "-" + String.join(", ", entry.getValue()))
            .collect(Collectors.joining("\n"));

        System.out.println(output);
    }
}
