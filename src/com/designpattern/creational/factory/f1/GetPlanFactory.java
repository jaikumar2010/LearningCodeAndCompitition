package com.designpattern.creational.factory.f1;

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if(planType == null)
            return null;
        if(planType.equalsIgnoreCase("Domestic")){
            return new DomesticPlan();
        }
        if(planType.equalsIgnoreCase("Comercial")){
            return new ComercialPlan();
        }
        if(planType.equalsIgnoreCase("Institutional")){
            return new InstitutionalPlan();
        }
        return null;
    }
}
