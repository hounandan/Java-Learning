package com.magicwithcode.intf;

public class Patient extends User{

    private long patientId;
    private boolean hasInsured;

    private HealthInsurancePlan insurancePlan;

    public HealthInsurancePlan getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }



}
