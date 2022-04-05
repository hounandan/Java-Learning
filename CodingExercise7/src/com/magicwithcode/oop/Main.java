package com.magicwithcode.oop;

public class Main {

    public static void main(String[] args) {

        HealthInsurancePlan insurancePlan = new PlatinumPlan();
        Patient patient = new Patient();
        //patient.setInsurancePlan(insurancePlan);

        double[] payments = Billing.computePaymentAmount(patient, 1000d);

        for(double payment: payments){
            System.out.println(payment);
        }

    }


}
