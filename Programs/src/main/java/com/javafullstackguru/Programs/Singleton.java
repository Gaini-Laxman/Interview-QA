package com.javafullstackguru.Programs;

public class Singleton implements  Cloneable{
    private static volatile Singleton instance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw  new CloneNotSupportedException("Cloning of singleton not allowed");
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Are both instance are same ? "+(singleton1==singleton2));
        try {
            Singleton clonedSingleton = (Singleton) singleton1.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
    }

}
