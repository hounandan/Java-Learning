package com.magicwithcode.intf;

public class Main {

    public static void main(String[] args) {

        User staff = new User();

        InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
        HealthInsurancePlan insurancePlan = new PlatinumPlan();

        insurancePlan.setOfferedBy(insuranceBrand);
        staff.setInsurancePlan(insurancePlan);
        double premium = insurancePlan.computeMonthlyPremium(5000d, 56, true);

        System.out.println(premium);



    }
}
