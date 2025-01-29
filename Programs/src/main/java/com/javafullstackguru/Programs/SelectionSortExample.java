package com.javafullstackguru.Programs;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 0, 1, 4, 5, 7, 9};
        selectionSort(arr);
        printArray(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
