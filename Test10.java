
public class Test10{
public static void main(String[] args){

String s = "radar";

int left = 0;
int right = s.length()-1;
boolean isPalidrom = true;

while(left<right){
	if(s.charAt(left) != s.charAt(right)){
		isPalidrom = false;
		break;
	}
	left++;
	right--;
}
if(isPalidrom){
	System.out.println(s+": is a palidrom");
}else{
	System.out.println(s+": is not palidrom");
}

}
}