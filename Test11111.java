
import java.util.*;
import java .util.stream.Stream;

public class Test111{
public static void main(String[] args){
	List<String> list = Arrays.asList("Apple", "Cherry", "Mango");
	
	Stream<String> stream = list.stream();
	stream.map(n -> n + "-"+ n.length()).forEach(System.out::println);
	
}
}