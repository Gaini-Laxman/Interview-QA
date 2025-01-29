package com.javafullstackguru.Programs;

public class WhileLoopExpl {
    public static void main(String[] args) {
        boolean flag = false;
        try {
            if (flag) {
                while (flag) {
                    System.out.println("Result");
                }
            } else {
                System.exit(1);
                System.out.println("Result");
            }
        } finally {
            System.out.println("In Finally");
        }
    }
}
