package com.magicwithcode.intf;

public class PlatinumPlan extends HealthInsurancePlan{

    public PlatinumPlan(){
        super(0.9d);
    }


    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return salary * 0.08d + getOfferedBy().computeMonthlyPremium(this, age, smoking) ;
    }
}
