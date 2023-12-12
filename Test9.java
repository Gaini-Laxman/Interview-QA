

public class Test9{
public static void main(String[] args){

int num = 151;
int remainder = 0;
int originalNum = num;
int reversedNum = 0;

while(num != 0){
	remainder = num % 10;
	reversedNum = reversedNum*10 + remainder;
	num /= 10;
}
if(originalNum == reversedNum){
		System.out.println(originalNum+": is a Palidrom !");
	}else{
		System.out.println(reversedNum+": is not Palidrom !");
	}

}
}