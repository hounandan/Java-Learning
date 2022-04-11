package com.magicwithcode.absint;

public class SilverPlan extends HealthInsurancePlan{

    public SilverPlan(){
        super(0.7d);
    }


    public double computeMonthlyPremium(double salary) {
        return salary * 0.6d;
    }
}
