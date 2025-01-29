package com.javafullstackguru.Programs;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
 class MyStringJoiner {
    public static void main(String[] args) {
        StringJoiner myString = new StringJoiner("-", "(",")");
        myString.add("laxman");
        myString.add("anitha");
        System.out.println(myString);
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
    }
}
