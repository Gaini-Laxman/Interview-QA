package com.javafullstackguru.Programs;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String s = "Laxman";
        char[] arr = s.toCharArray();
        boolean hasDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println("Duplicate :" + arr[i]);
                hasDuplicate = true;
            }
        }
        if (!hasDuplicate) {
            System.out.println("Duplicates not found");

        }
    }
}
