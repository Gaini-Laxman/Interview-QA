package com.javafullstackguru.Programs;

public class BreakStatementIfCondition {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
          if(i == 7){
              return;
          }
            System.out.println(i+" ");
        }
        System.out.println("method still return ?");
    }
}
