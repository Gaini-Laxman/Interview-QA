class Factorial{
static int factorial(int n){
if(n!=0){
return n*factorial(n-1);
}else {
return 1;
}
}
public static void main(String [ ] args){
int number = 6 ,result;
result = factorial(number);
System.out.print("Factorial Number :"+result);
}
}
