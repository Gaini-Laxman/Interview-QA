package com.javafullstackguru.Programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 5, 6};
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.print(num+" - ");
                //print duplicate
            }
        }
        System.out.println(set);
        //remove duplicate and print distinct
    }
}
