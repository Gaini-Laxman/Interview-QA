import java.util.Scanner;

public class PerfectFactorial{
public static void main ( String[ ] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
if(isStrongerNumberOrNot(N))
System.out.println("Yes");
else
System.out.println("No");
sc.close();
}
private static boolean isStrongerNumberOrNot(int n){
int rem=0, t=n;
long sum=0;
while(n!=0){
rem=n%10;
sum=sum+factorialOfN(rem);
n/=10;
}
return (t==sum);
}
private static long factorialOfN(int n){
long factorial = 1;
long sum = 0;
for(int i =n; i>=1; i--){
factorial  = factorial*i;
}
return factorial;
}
}


