package com.javafullstackguru.Programs;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number To print Multiplication Table");
        int number = scanner.nextInt();
        System.out.println("Multiplication Table of :" + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}
