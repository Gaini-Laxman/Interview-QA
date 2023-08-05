import java.util.Arrays;

public class NegativePassitveNumber{
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, 2, -7, -5, 11, 6};

        int[] sortedArr = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    if (a >= 0 && b < 0) {
                        return -1; // a comes before b
                    } else if (a < 0 && b >= 0) {
                        return 1; // b comes before a
                    } else {
                        return Integer.compare(a, b); // natural order for both positive and negative numbers
                    }
                })
                .mapToInt(Integer::intValue)
                .toArray();

        // Print the sorted array
        Arrays.stream(sortedArr).forEach(num -> System.out.print(num + " "));
    }
}
