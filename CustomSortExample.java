import java.util.*;
import java.util.stream.*;

public class CustomSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 43, 3, 9, 10);

        // Step 1: Separate odd and even numbers
        List<Integer> oddNumbers = numbers.stream()
                                          .filter(n -> n % 2 != 0)
                                          .sorted()
                                          .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // Step 2: Combine odd and even lists
        List<Integer> result = new ArrayList<>();
        result.addAll(oddNumbers);
        result.addAll(evenNumbers);

        // Output the result
        System.out.println(result.stream()
                                 .map(String::valueOf)
                                 .collect(Collectors.joining(",")));
    }
}
