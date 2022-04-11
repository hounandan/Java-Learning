package com.magicwithcode.absint;

public class PlatinumPlan extends HealthInsurancePlan{

    public PlatinumPlan(){
        super(0.9d);
    }


    public double computeMonthlyPremium(double salary) {
        return salary * 0.8d;
    }
}
