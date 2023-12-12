import java.util.*;
import java.util.stream.Stream;

public class Test6{
public static void main(String[] args){
int[] arr = {1, 3, 2, 4, 6, 5, 7};
 
 Stream<Integer> arr1 = Arrays.stream(arr).boxed().sorted();
 arr1.forEach(System.out::print);
 
 System.out.println("\n"+"=======================");
 
 Stream<Integer> arr2 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder());
 arr2.forEach(System.out::print);
 
 System.out.println("\n"+"=======================");
 
 Stream<Integer> arr3 = Arrays.stream(arr).boxed().sorted().filter(n -> n%2==0);
 arr3.forEach(System.out::print);
 
 System.out.println("\n"+"=======================");
 
 Stream<Integer> arr4 = Arrays.stream(arr).boxed().sorted().filter(n -> n%2==0).map(n -> n*n);
 arr4.forEach(System.out::print);
 
 System.out.println("\n"+"=======================");
 
 Stream<Integer> arr5 = Arrays.stream(arr).boxed().sorted().filter(n -> n%2 != 0).map(n -> n*n);
 arr5.forEach(System.out::print);
 
 System.out.println("\n"+"=======================");
 
 Optional<Integer> arr6 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	if(arr6.isPresent()){
	System.out.print("Second Highest is:"+arr6.get());
                }else{
            System.out.print("Not Found Any Elements");
								}

  System.out.println("\n"+"=======================");
 
 Optional<Integer> arr7 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst();
	              if(arr7.isPresent()){
	             System.out.print("Third Highest is:"+arr7.get());
	             }else{
		System.out.print("Not Found Any Elements");
}
 
}
}