package JavaLearn.Bach30.SpringCore.impl;

import JavaLearn.Bach30.SpringCore.IVehicle;
import org.junit.Before;
import org.junit.Test;

public class VehicleImplTest {
    private IVehicle iVehicle = null;
    @Before
    public void setUp() throws Exception {
        iVehicle = new BMWVehicleImpl();
    }
    @Test
    public void vehicleDetail() throws Exception{
        iVehicle.vehicleName();
        iVehicle.drivingSpeed();
    }
}