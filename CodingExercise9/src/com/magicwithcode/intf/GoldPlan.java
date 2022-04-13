package com.magicwithcode.intf;

public class GoldPlan extends HealthInsurancePlan{

    public GoldPlan(){
        super(0.8d);
    }

    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return salary * 0.07d + getOfferedBy().computeMonthlyPremium(this, age, smoking) ;
    }
}
