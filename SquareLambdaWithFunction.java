// Define the functional interface
interface printNumber {
    void print(int num);
}

public class SquareLambdaWithFunction {
    public static void main(String[] args) {
        // Assign the lambda expression to a variable of the functional interface type
        printNumber p = (n) -> System.out.println(n * n);

        // Call the lambda expression with an argument
        p.print(5); // Output: 25
    }
}
