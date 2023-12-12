import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Test12{
public static void main(String[] args){
	int a =5, b=10;
	System.out.println("Before Swapping :"+"a: "+a+",b: "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After  Swapping :"+"a: "+a+",b: "+b);
	
	System.out.println("\n"+"===============");
	
	int x = 5, y=10, z = 15;
	int temp = z;
	System.out.println("Before Swapping :"+"x : "+x+", y : " +y+", z :"+z);
	x = y;
	y = temp;
	temp = y;
	
	System.out.println("After  Swapping :"+"x : "+x+", y : " +y+", z :"+z);
	
	System.out.println("\n"+"===============");
		System.out.println("\n"+"Using Stream Api :");
	int[ ] num = {1,2,3,4,5};
	
	Stream<Integer> num1 = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder());
	num1.forEach(System.out::print);
	
	System.out.println("\n"+"===============");
	
	int num2 = 12345;
	
		System.out.println("\n"+"Using While Loop");
	   while(num2 != 0){
		System.out.print(num2 %10);
		num2 /= 10; 
	}
	
	System.out.println("\n"+"===============");
	
	
	int[ ] arr = {1,-1,3,2,-7,-5,11,6};
	//output {1, 3, 2, 11, 6, -1, -7, -5}
	
	int[] output = Arrays.stream(input)
                .boxed() // Convert to Integer objects
                .sorted(Comparator.comparingInt(Math::abs).reversed()) // Sort by absolute value in descending order
                .mapToInt(Integer::intValue) // Convert back to primitive int
                .toArray();
                
        System.out.println(Arrays.toString(output));
	
}
}