package JavaLearn.Bach30.SpringCore.impl;

import JavaLearn.Bach30.SpringCore.IVehicle;

public class HondaVehicleImpl implements IVehicle {
    @Override
    public void drivingSpeed() {
        System.out.println("The Driving Speed of Honda Vehicle is 120 Mph");
    }

    @Override
    public void vehicleName() {
        System.out.println("Vehicle Name is Honda.....");
    }


}
