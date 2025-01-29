package com.javafullstackguru.Programs;

import java.util.*;

public class FindLargetNumberArrayJava8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 6, 7, 9, 0, 24);
        Optional<Integer> max = list.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println("Highest Number : "+max.get());
        Optional<Integer> min = list.stream().min(Comparator.comparing(Integer::intValue));
        System.out.println("Lowest Number : "+min.get());
        Optional<Integer> secondHigh = list.stream().sorted(Comparator.reverseOrder()).skip(0).findFirst();
        System.out.println("Second Highest Number : "+secondHigh.get());


    }
}
