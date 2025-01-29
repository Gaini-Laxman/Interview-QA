package com.javafullstackguru.Programs;


import java.util.*;

public class PaireSumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        findPaind(arr, target);
    }

    private static void findPaind(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = arr[i] - target;
            if (map.containsKey(complement)) {
                System.out.println(arr[i] + "+" + complement + "=" + target);
            }
            map.put(arr[i], i);
        }
    }
}
