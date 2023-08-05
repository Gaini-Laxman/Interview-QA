import java.util.Scanner;
import java.util.Arrays;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter the elements of the matrix:");

        // Input matrix elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate and print the sum of diagonal elements using reduce method
        int diagonalSum = Arrays.stream(matrix)
                .reduce(0, (sum, row) -> sum + row[Arrays.asList(matrix).indexOf(row)], Integer::sum);

        System.out.println("Sum of diagonal elements: " + diagonalSum);

        sc.close();
    }
}
