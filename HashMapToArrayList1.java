import java.util.*;

public class HashMapToArrayList1 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Laxman");
        map.put(2, "Anu");
        map.put(3, "Naresh");

        //for (String value : map.values()) {
          //  System.out.println(value);
       // }

      for (Integer key : map.keySet()) {
            System.out.println(key);
        }



    }
}
