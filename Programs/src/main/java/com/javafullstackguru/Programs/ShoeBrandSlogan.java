package com.javafullstackguru.Programs;

import java.util.Scanner;

public class ShoeBrandSlogan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();

        if (brand.equalsIgnoreCase("Nike")) {
            System.out.print("Nike -> Just Do It");
        } else if (brand.equalsIgnoreCase("Adidas")) {
            System.out.println("Adidas -> Impossible is Nothing");
        } else if (brand.equalsIgnoreCase("Puma")) {
            System.out.println("Puma -> Forever Faster");
        } else if (brand.equalsIgnoreCase("Reebok")) {
            System.out.println("I am What I am");
        } else {
            System.out.println("Unkown Brand. Please enter valid brand name !");
        }
        sc.close();
    }
}
