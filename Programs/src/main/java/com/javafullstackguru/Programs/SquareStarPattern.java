package com.javafullstackguru.Programs;

public class SquareStarPattern {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;

        for (int i=1; i<=row; i++){
            for (int j=1; j<=column; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
