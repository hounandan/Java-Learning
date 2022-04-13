package com.magicwithcode.intf;

public class BlueCrossBlueShield implements InsuranceBrand{

    private long id;
    private String name;



    public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking){

        double premium = 0d;
        if(insurancePlan instanceof PlatinumPlan){
            if(age > 55) premium += 200d;
            if(smoking) premium += 100d;
        }else if(insurancePlan instanceof GoldPlan){
            if(age > 55) premium += 150d;
            if(smoking) premium += 90d;
        }else if(insurancePlan instanceof SilverPlan){
            if(age > 55) premium += 100d;
            if(smoking) premium += 80d;
        }else if(insurancePlan instanceof BronzePlan){
            if(age > 55) premium += 50d;
            if(smoking) premium += 70d;
        }
        return premium;

    }



    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
