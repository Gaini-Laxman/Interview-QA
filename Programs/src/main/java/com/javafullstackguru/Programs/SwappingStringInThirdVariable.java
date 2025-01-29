package com.javafullstackguru.Programs;

public class SwappingStringInThirdVariable {
    public static void main(String[] args) {
        String str1 = "Laxman";
        String str2 = "Anitha";
        System.out.println(str1+"-"+str2);
        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println(str1+ "-" + str2);
    }
}
