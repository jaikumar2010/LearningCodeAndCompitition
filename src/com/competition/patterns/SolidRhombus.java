package com.competition.patterns;

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------Pyramid Pattern-------------");
        for (int i = 1; i <=5 ; i++) {
            //System.out.print(" ");
            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
               // System.out.print("");
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("-----------Palindromic Patter-------------");
        for (int i = 1; i <=n ; i++) {
            //System.out.print(" ");
            for (int j = n; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                // System.out.print("");
                System.out.print(j);
            }
            for (int j = 2; j <=i ; j++) {
               System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-----------Diamond Patter-------------");
        for (int i = 1; i <5 ; i++) {
            //System.out.print(" ");
            for (int j =1; j <=5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1) ; j++) {
                // System.out.print("");
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5; i >=1 ; i--) {
            //System.out.print(" ");
            for (int j = 1; j<=5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                // System.out.print("");
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
