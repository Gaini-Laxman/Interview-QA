package com.javafullstackguru.Programs;

public class BuubleSortExample {
    public static void main(String[] args) {
        int[] arr = {8,3,5,9,0,1,4,3};
        bubbleSort(arr);
        printArray(arr);
    }
    private static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length - 1; i++){
            for (int j=0; j<arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    private static void printArray(int[] arr){
     for (int num : arr){
         System.out.println(num);
     }
    }
}
