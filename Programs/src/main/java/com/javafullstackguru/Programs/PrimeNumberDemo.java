package com.javafullstackguru.Programs;

public class PrimeNumberDemo {
    public static void main(String[] args) {


        for (int num = 2; num < 100; num++){
            if (isPrime(num)){
                System.out.print(num + " ");
            }
        }
    }
    public  static boolean isPrime(int number){
        if (number <= 1){
            return  false;
        } else if (number == 2) {
            return  true;
        } else if (number % 2 == 0) {
            return false;
        }else {
            for (int i = 3; i <= Math.sqrt(number); i += 2){
                if (number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
