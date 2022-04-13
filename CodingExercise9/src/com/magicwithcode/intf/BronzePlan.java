package com.magicwithcode.intf;

public class BronzePlan extends HealthInsurancePlan{

    public BronzePlan(){
        super(0.6d);
    }

    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return salary * 0.05d + getOfferedBy().computeMonthlyPremium(this, age, smoking) ;
    }
}
