package com.magicwithcode.absint;

public class BronzePlan extends HealthInsurancePlan{

    public BronzePlan(){
        super(0.6d);
    }

    public double computeMonthlyPremium(double salary) {
        return salary * 0.5d;
    }
}
