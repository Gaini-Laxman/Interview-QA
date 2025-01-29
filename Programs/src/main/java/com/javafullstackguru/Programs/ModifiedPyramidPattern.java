package com.javafullstackguru.Programs;

public class ModifiedPyramidPattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("   "); // Three spaces for alignment
            }

            // Print stars with varied spacing
            for (int k = 1; k <= i; k++) {
                if (k == i) {
                    System.out.print("*   "); // Additional space for the last star
                } else {
                    System.out.print("*  "); // Normal space
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}

