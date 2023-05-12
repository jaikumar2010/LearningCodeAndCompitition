package com.competition.numbers;

public class OneDArrayGame {

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,0,1,1,0,0,1,1,0,0};
        int leap = 3;

        for (int i = 0; i < arr.length-1; i++) {

 
                    i = i +leap;
                    if(i>= arr.length-1){
                        break;
                    }else{
                        System.out.println(arr[i]+" "+i);
                    }



            }

    }
}
