
import java.util.*;

public class ReverseSorting{
    public static void main(String[] args) {
        //int num = {1,5,7,3,9};
        List<Integer> list = Arrays.asList(1,5,7,3,9);
        int num = list.stream().sorted(Comparator.reverseOrder()).skip(1
        ).findFirst().orElse(-1);
        System.out.print(" "+num); 
        
    }
}