package com.javafullstackguru.Programs;

public class ReverseString1 {
    public static void main(String[] args) {
        String str = "Laxman";

//        for (int i = str.length() - 1; i >= 0; i--){
//            System.out.print(str.charAt(i));
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        System.out.println(sb);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
        }
    }
//}
