import java.util.Scanner;

public class ReverseNumber {
public static void main (String [] args){
Scanner sc =  new Scanner(System.in);
int num = sc.nextInt();
printNumberInReverseOrder(num);
sc.close();
}
public static void printNumberInReverseOrder(int num){

while (num!=0){
System.out.print(num%10);
num/=10;
}
}
}