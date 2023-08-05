import java.util.*;

public class HashMapToArrayList {
    public static void main(String args[]) {
       Map<Integer, String> map = new HashMap<>();
        map.put(1, "Laxman");
        map.put(2, "Anu");

        List<String> list = new ArrayList<>(map.values());
        list.forEach(System.out::println);
    }
}
