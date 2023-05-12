package com.competition.numbers;

import java.util.Scanner;

public class NumberSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // how many series
        int t = scanner.nextInt();

        for (int i = 0; i <t ; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();// length of generated elements

            System.out.println("a= "+a+"b= "+b+"n= "+n);
            int result = (a)+(2^0 * b);
            for(int j=0;j<n;j++){
                if(j==0){
                    System.out.print(result+" ");
                }else{
                    result +=2^j * b;
                    System.out.print(result+" ");
                }

            }
            System.out.println();


        }
    }


}
