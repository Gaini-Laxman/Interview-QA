

public class Test8{
public static void main(String[] args){
String s = "Central Board Secondary Education";
String[] arr = s.split(" ");
for(String name : arr){
	if(!name.isEmpty()){
		char ch = name.charAt(0);
		System.out.print(ch);
	}
}
}
}