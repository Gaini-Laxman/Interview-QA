package com.javafullstackguru.Programs;

public class Armstrang {
    public static void main(String[] args) {
        int num = 153;
        int result = 0;
        int originalNumber = num;
        int numberOfDigit = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result = result + (int) Math.pow(digit, numberOfDigit);
            num /= 10;
        }
        if (originalNumber == result) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not armstrong");
        }
    }
}
