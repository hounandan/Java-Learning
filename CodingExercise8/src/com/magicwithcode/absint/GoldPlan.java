package com.magicwithcode.absint;

public class GoldPlan extends HealthInsurancePlan{

    public GoldPlan(){
        super(0.8d);
    }

    public double computeMonthlyPremium(double salary) {
        return salary * 0.7d;
    }
}
