
public class Test2{
public static void main(String[] args){
String s = "Laxman";
char[] arr = s.toCharArray();
for(int i=0; i<arr.length; i++){
	boolean isDuplicate = false;
	char ch = s.charAt(i);
	for(int j=i+1; j<arr.length; j++){
		if(arr[i] == arr[j]){
			isDuplicate = true;
			break;
		}
	}
	if(isDuplicate){
		System.out.print("Dulpicate value is a :"+arr[i]);
	}
	
}
}
}