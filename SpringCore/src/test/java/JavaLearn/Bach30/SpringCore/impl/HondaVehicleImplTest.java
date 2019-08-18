package JavaLearn.Bach30.SpringCore.impl;

import JavaLearn.Bach30.SpringCore.IVehicle;
import org.junit.Before;
import org.junit.Test;

public class HondaVehicleImplTest {
    private IVehicle iVehicle = null;
    @Before
    public void setUp() throws Exception {
        iVehicle = new HondaVehicleImpl();
    }
    @Test
    public void drivingSpeed() throws Exception{
        iVehicle.drivingSpeed();
    }
    @Test
    public void vehicleDetail() throws Exception{
        iVehicle.vehicleName();
        iVehicle.drivingSpeed();
    }
}