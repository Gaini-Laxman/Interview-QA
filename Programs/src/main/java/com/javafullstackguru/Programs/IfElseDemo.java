package com.javafullstackguru.Programs;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = scanner.nextInt();

        if ((num % 2) == 0){
            System.out.println("Inside if block");
        }else {
            System.out.println("inside else block");
        }
       scanner.close();
    }
}
