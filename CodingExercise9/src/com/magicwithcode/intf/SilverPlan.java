package com.magicwithcode.intf;

import com.magicwithcode.intf.HealthInsurancePlan;

public class SilverPlan extends HealthInsurancePlan {

    public SilverPlan(){
        super(0.7d);
    }


    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return salary * 0.06d + getOfferedBy().computeMonthlyPremium(this, age, smoking) ;
    }
}
