package com.javafullstackguru.Programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String s = "Laxman";

        Map<Character, Long> map = s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((character, count) -> System.out.println(character+"="+count));
    }
}
