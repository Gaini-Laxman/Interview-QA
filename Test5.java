import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test5{
public static void main(String[] args){

int[] arr = {1,1,2,2,3,4,4,5};
//print {1,2,3,4,5};

//List<Integer> arr1 = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());

//arr1.forEach(System.out::print);

Stream<Integer> arr1 = Arrays.stream(arr).boxed().distinct();

arr1.forEach(System.out::print);


}
}