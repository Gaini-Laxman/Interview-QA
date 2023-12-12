

public class Test99{
public static void main(String[] args){
	 
	 int num = 151;
	 int reversedNum = 0;
	 int originalNum = num;
	 int remainder = 0;
	 
	 while(num != 0){
		 remainder =  num % 10;
		 reversedNum = reversedNum * 10 + remainder;
		 num/=10;
	 }
	 if(originalNum == reversedNum){
		 System.out.println(originalNum+": is palidrom");
	 }else{
		 System.out.println(originalNum+": is not palidrom");
	 }
	
}
}