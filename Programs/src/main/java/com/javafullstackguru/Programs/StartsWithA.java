package com.javafullstackguru.Programs;

import java.util.Arrays;
import java.util.List;

public class StartsWithA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anuska", "Anitha", "Aravind", "Vikram", "Laxman");
       long count = list.stream().filter(n -> n.startsWith("A")).peek(System.out::println).count();

        if(count == 0){
            System.out.println("No Name found with b given latter");
        }
    }
}
