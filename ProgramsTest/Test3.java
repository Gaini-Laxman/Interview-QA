import java.util.*;

public class Test3{
public static void main(String[] args){
String s = "Laxman";
//print Laxmn;

Set<Character> set = new HashSet<>();
StringBuilder sb = new StringBuilder();
for(int i=0; i<s.length(); i++){
	char ch = s.charAt(i);
	if(!set.contains(ch)){
	set.add(ch);
	sb.append(ch);
	}
}
System.out.print(sb);
}
}