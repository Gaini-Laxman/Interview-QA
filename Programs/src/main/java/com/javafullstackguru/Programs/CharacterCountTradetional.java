package com.javafullstackguru.Programs;

import java.util.HashSet;
import java.util.Set;

public class CharacterCountTradetional {
    public static void main(String[] args) {
        String s = "Laxman";
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
