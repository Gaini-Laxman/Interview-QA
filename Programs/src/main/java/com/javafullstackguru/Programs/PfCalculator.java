package com.javafullstackguru.Programs;

import java.util.Scanner;

public class PfCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Basic Salary ");
        double basicSalary = scanner.nextDouble();
        double pf = basicSalary * 0.12;
        System.out.println("This is your pf amount : "+pf);
        scanner.close();
    }
}
