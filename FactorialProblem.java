
import java.util.Scanner;

public class FactorialProblem{
public static void main (String [ ] args){
Scanner sc = new Scanner(System.in);
System.out.println( "Enter Here ");
int N = sc.nextInt();

long result = factorialOfN(N);
System.out.printf("%d", result);
sc.close();
}

private static long factorialOfN(int n){
long factorial = 1;
long sum = 0;
for(int i=n; i>=1; i--){
factorial = factorial*i;
}
return factorial;
}
}

