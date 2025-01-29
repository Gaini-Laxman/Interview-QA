package com.javafullstackguru.Programs;

public class PalidromeInteger {
    public static void main(String[] args) {
        int num = 121;
        int remainder;
        int reverseNum = 0;
        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;
        }
       if (originalNum == reverseNum){
           System.out.println("Palidrome");
       }else {
           System.out.println("not Palidrome");
       }
    }
}
