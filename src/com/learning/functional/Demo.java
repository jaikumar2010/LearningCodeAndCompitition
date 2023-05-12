package com.learning.functional;

public class Demo {
    public static void main(String[] args) {
        MyInterface mi = (x,y,z) ->  x + y + z;
        System.out.println(mi.sum(10,50,80));
    }
}


