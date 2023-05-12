package com.designpattern.creational.factory.f1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {

        GetPlanFactory getPlanFactory = new GetPlanFactory();

        // input plan type
        String planName;
        System.out.println("Name of plan: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        planName = bufferedReader.readLine();

        // input total units
        Integer units;
        System.out.println("Units: ");
        units = Integer.parseInt(bufferedReader.readLine());

        Plan plan = getPlanFactory.getPlan(planName);

        // calculate bull
        System.out.print("Total amount for "+planName+" "+"Units: "+units+" ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
