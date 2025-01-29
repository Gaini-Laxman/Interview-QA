package com.javafullstackguru.Programs;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int num : arr) {
            System.out.print(num+ " ");
        }
        System.out.println();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
