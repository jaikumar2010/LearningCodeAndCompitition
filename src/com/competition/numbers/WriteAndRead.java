package com.competition.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WriteAndRead {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);

        //String writeSomething = scanner.nextLine();

        //System.out.println(writeSomething);

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String myString = br.readLine();
        System.out.println(myString);
    }
}
