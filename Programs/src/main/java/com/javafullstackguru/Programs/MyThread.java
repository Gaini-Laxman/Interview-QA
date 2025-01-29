package com.javafullstackguru.Programs;

public class MyThread implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i=0; i<=10; i++){
            System.out.println(t.getName()+"Thread-value"+i);
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        //t.start();
        t.run();
    }
}
