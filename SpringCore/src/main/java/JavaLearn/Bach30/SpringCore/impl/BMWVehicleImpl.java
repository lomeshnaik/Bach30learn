package JavaLearn.Bach30.SpringCore.impl;

import JavaLearn.Bach30.SpringCore.IVehicle;

public class BMWVehicleImpl implements IVehicle {
    @Override
    public void drivingSpeed() {
        System.out.println("The Driving Speed of BMW Vehicle is 160 Mph");
    }

    @Override
    public void vehicleName() {
        System.out.println("Vehicle Name is BMW....");
    }


}
