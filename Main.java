

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(8);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(6);
        list.add(8);

        List<Integer> collection1 = new ArrayList<>();
        List<Integer> collection2 = new ArrayList<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (Integer num : list) {
            if (uniqueElements.contains(num)) {
                collection2.add(num);
            } else {
                collection1.add(num);
                uniqueElements.add(num);
            }
        }

        System.out.println("Collection 1 = " + collection1);
        System.out.println("Collection 2 = " + collection2);
    }
}