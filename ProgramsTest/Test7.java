

public class Test7{
public static void main(String[] args){
int num = 151;
int originalNum = num;
int reversedNum = 0;
int remainder = 0;

while(num != 0){
	remainder = num%10;
	reversedNum = reversedNum*10 + remainder;
	num /=10;
	
}
if(originalNum == reversedNum){
	System.out.println(originalNum+" : is palidrome");
}else{
	System.out.println(originalNum+" : is not a palidrome ");
}

}
}