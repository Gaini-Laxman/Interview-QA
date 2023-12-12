import java.util.*;
import java.util.Arrays;
import  java.util.stream.Stream;
import  java.util.stream.Collectors;

public class Test55{
public static void main(String[] args){
	
	int[] arr  = {1,1,2,2,3,3,4,5,6,7};
	
	Stream<Integer> arr1 = Arrays.stream(arr).boxed().distinct();
	arr1.forEach(System.out::print);
	
	System.out.println("\n"+"============");
	
	List<Integer> arr2 = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
	arr2.forEach(System.out::print);
	
	System.out.println("\n"+"============");
	
	Stream<Integer> arr3 = Arrays.stream(arr).boxed().distinct().sorted();
	arr3.forEach(System.out::print);
	
	System.out.println("\n"+"============");
	
	Stream<Integer> arr4 = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder());
	arr4.forEach(System.out::print);
	
	System.out.println("\n"+"============");
	
	Optional<Integer> arr5 = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	         if(arr5.isPresent()){
				 System.out.print("Second Highest :"+arr5.get());
			 }else{
				  System.out.print("No Second Highest");
			 }
	
	//arr5.forEach(System.out::print);
	
	System.out.println("\n"+"============");
	
}
}