package com.magicwithcode.codingExercise;

public class Patient extends User{

    private long patientId;
    private boolean hasInsured;

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
