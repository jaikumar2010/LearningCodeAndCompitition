package com.functional;

import java.util.Arrays;
import java.util.List;

public class TranformingIterations {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // external iteration
        for (int i = 0; i < number.size(); i++) {
           // System.out.print(number.get(i));
        }
        System.out.println();
        // ehance loop
        for(Integer i: number){
            //System.out.print(i);
        }
        System.out.println();
        //-------------Internal Iteration------------
        //number.forEach(System.out::println); // Method Reference to instance method

//        number.stream()
//               // .map(String::valueOf)// static method reference
//               // .forEach(System.out::print);
//                .map(i->Integer.hashCode(i))
//                .forEach((value)->System.out.println(value));

        System.out.println(
        number.stream()
//                .reduce(0,(total,e)-> Integer.sum(total,e)));
                .reduce(0,Integer::sum));


    }

    // Limitation of method reference
}
