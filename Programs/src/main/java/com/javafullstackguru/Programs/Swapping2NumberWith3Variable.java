package com.javafullstackguru.Programs;

public class Swapping2NumberWith3Variable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println(a + "-" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + "-" + b);
    }
}
