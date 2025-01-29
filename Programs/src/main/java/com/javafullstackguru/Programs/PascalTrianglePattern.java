package com.javafullstackguru.Programs;

public class PascalTrianglePattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 1; j--) {
                System.out.print("   ");
            }
            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.printf("%6d", number);
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
