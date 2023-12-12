
public class Test77{
public  static void main(String[] args){
	String s = "Laxman Anitha Vikramaditya";
	
	String[] arr = s.split(" ");
	StringBuilder sb = new StringBuilder();
	for(int i=arr.length-1; i>=0; i--){
		sb.append(arr[i]);
		if(i>0){
			sb.append(" ");
		}
		
	}
	System.out.println(sb);
}
}