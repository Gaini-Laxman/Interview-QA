package com.javafullstackguru.Programs;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.print("Max :" + max + " ");
        System.out.print("Min :" + min + " ");

    }
}
