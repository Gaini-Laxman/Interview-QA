package com.javafullstackguru.Programs;

public class PalidromeString {
    public static void main(String[] args) {
        String s = "laxman";
        int left = 0;
        int right = s.length() - 1;
        boolean isPalidrome = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalidrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalidrome ? "Palidrome" : "Not Palidrome");
    }
}
