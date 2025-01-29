package com.javafullstackguru.Programs;

import java.util.Scanner;

public class SimpleIfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number ...");

        int num = sc.nextInt();
        if((num % 5) == 0){

            System.out.println("Inside If Block");
            System.out.println("Divisible by 5");
        }
        System.out.println("Outside Block");
    }
}
