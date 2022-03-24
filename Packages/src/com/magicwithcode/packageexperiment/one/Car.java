package com.magicwithcode.packageexperiment.one;

public class Car {

    public String brandName;
    public int model;

    String carName;
    protected String uniqueToOne = "This is unique to Package com.magicwithcode.packageexperiment.one";
    private String engineId = "1452";

    public Car(String brandName, int model){
        this.brandName = brandName;
        this.model = model;
    }

    public String getBrandName(){
        return this.brandName;
    }

    public int getModel(){
        return this.model;
    }

    String getCarName(){
        return this.carName;
    }

    protected void getUniqueToOne(){
        System.out.println(uniqueToOne);
    }

    private String getEngineId(){
        return this.engineId;
    }

}
