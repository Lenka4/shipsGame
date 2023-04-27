package com.lenka4;
public class Main {
    public static void main(String[] args) {
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print( (char) ('A'+i) );
        }
        System.out.println( );
        for (int i = 1; i <= 10; i++) {
            if (i < 10){
                System.out.print(' ');
            }
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                if (Math.random() < 0.2) {
                    System.out.print('o');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
            }

        }
}