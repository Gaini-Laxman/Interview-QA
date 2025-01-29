package com.javafullstackguru.Programs;

import java.util.Scanner;

public class MarriegeEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();

        System.out.println("Enter Salary");
        double salary = scanner.nextDouble();

        if (age > 18 && age < 30 && salary > 10000) {
            System.out.println("Eligible for marriege");
        } else {
            System.out.println("Your Dummy Fellow !! So Not Eligible for marriege");
        }
        scanner.close();
    }
}
