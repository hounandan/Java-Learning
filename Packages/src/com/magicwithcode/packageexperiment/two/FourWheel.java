package com.magicwithcode.packageexperiment.two;

import com.magicwithcode.packageexperiment.one.Car;

class FourWheel extends Car {

    public String name;

    public FourWheel(String brandName, int model, String name){
        super(brandName, model);
        this.name = name;
    }

    public void hasAccess_protected(){

        //new Car("Ford", 2022).getUniqueToOne(); // Will not work - protected won't work this way

        new FourWheel("Ford", 2022, "Mustang").getUniqueToOne();
        // Will work - cause' FourWheel is a subclass of Car
        // By definition - a protected field/method/class is only accessible on its subclass

        this.getUniqueToOne();
        // This is same as the previous implementation

    }

    public void hasAccess_default(){

        Car c = new Car("Mercedes", 2022);

        //String carName = c.getCarName();
        // No possible - cause' the getCarName() is of default access and it can be accessed outside the package

    }

    public void hasAccess_public(){

        Car c = new Car("Mercedes", 2022);

        String brandName = c.getBrandName();
        int  model = c.getModel();

    }

    public void hasAccess_private(){

        Car c = new Car("Mercedes", 2022);

        //String engineId = c.getEngineId();
        // Not possible - cause' the getEngineId() has private access - cannot accesss even outside the class

    }

}
