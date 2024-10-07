import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Test4{
public static void main(String[] args){
	String s = "Laxman";
	
	Map<Character, Long> map = s.chars().mapToObj(c ->(char) c)
	.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	map.forEach((Character, count) -> System.out.println(Character+"="+count));
	
	//s.chars().mapToObj(c ->(char) c).filter(Character::isLetter)
	 //.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	 //.forEach((c, count) -> System.out.println(c+"="+count));
	
}

}