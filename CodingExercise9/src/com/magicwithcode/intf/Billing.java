package com.magicwithcode.intf;

public class Billing {

    public static double[] computePaymentAmount(Patient patient, double amount){

        double[] payments = new double[2];

        double insurancePayment = 0.0d;
        double patientPayment = 0.0d;
        if(null != patient.getInsurancePlan()){

            HealthInsurancePlan insurancePlan = patient.getInsurancePlan();
            double insuranceCoverage = insurancePlan.getCoverage();
            insurancePayment = amount * insuranceCoverage;
            patientPayment = amount - insurancePayment;

            if(insurancePlan instanceof PlatinumPlan) patientPayment -= 50d;
            else if(insurancePlan instanceof GoldPlan) patientPayment -= 40d;
            else if(insurancePlan instanceof SilverPlan) patientPayment -= 30d;
            else if(insurancePlan instanceof BronzePlan) patientPayment -= 25d;


        }else {
            patientPayment = amount - 20d;
        }

        payments[0] = insurancePayment;
        payments[1] = patientPayment;
        return payments;
    }

}
