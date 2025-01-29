package com.javafullstackguru.Programs;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 0, 4, 5, 2, 1, 4};
        insertionSort(arr);
        printArray(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    private static void printArray(int[] arr){
        for (int num : arr){
            System.out.println(num);
        }
    }
}
