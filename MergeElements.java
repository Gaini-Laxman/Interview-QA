import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeElements {
    public static void main(String[] args) {
        List<String[]> input = new ArrayList<>();
        input.add(new String[]{"mh", "pune"});
        input.add(new String[]{"AP", "Hyderabad"});
        input.add(new String[]{"mh", "Mumbai"});

        List<String> output = mergeElements(input);

        output.forEach(System.out::println);
    }

    private static List<String> mergeElements(List<String[]> input) {
        Map<String, String> mergedMap = input.stream()
                .collect(Collectors.toMap(
                        arr -> arr[0],
                        arr -> arr[1],
                        (existingValue, newValue) -> existingValue + ", " + newValue
                ));

        return mergedMap.entrySet().stream()
                .map(entry -> entry.getKey() + ", " + entry.getValue())
                .collect(Collectors.toList());
    }
}
