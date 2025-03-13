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


=============================================
interface PrintNumber {
    void print(int num);
}

public class SquareMethodReference {
    public static void square(int n) {
        System.out.println(n * n);
    }

    public static void main(String[] args) {
        PrintNumber p = SquareMethodReference::square; // Method reference
        p.print(5); // Output: 25
    }
}
