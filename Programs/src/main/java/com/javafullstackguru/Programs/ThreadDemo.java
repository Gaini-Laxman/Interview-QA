package com.javafullstackguru.Programs;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("first :"+t);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getThreadGroup());
        System.out.println(t.getClass());
    }
}
