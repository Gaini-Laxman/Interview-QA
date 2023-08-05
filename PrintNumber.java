// Define the functional interface

@functionalInterface
interface PrintNumber {
    public void print(int num1);
}

public class SquareLambdaWithFunction {
    public static void main(String[] args) {
       
        PrintNumber p = (n) -> System.out.println(n * n);

     
        p.print(5); // Output: 25
    }
}
