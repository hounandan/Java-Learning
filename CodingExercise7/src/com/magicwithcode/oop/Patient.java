package com.magicwithcode.oop;

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

    public boolean isHasInsured() {
        return hasInsured;
    }

    public void setHasInsured(boolean hasInsured) {
        this.hasInsured = hasInsured;
    }

}
