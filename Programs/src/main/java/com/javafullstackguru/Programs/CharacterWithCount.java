package com.javafullstackguru.Programs;

import java.util.Arrays;
import java.util.List;

public class CharacterWithCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mango", "fine-apple", "grapes", "apple");
        list.stream().map(n->n+"-"+n.length()).forEach(System.out::println);
    }
}
