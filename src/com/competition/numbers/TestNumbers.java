package com.competition.numbers;

public class TestNumbers {

    // use of Math.pow();
    // do not calculate like (2^3) + 2

    public static void main(String[] args) {
        double result = Math.pow(2,0);
        result = result * 2;

        for (int i = 0; i < 5; i++) {
            System.out.println("i= "+i);

            if(i==0){
                System.out.println("Result= "+(int)result);
            }else{
                result += Math.pow(2,i)*2;
                System.out.println("Result= "+(int)result);
            }



        }
    }
}
