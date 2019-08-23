package JavaLearn.Bach30.SpringCore.impl;

import JavaLearn.Bach30.SpringCore.IVehicle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleImplTest {
    private IVehicle iVehicle = null;
    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext_ComponentScane.xml");
        iVehicle = (IVehicle) context.getBean("vehicle");
       // iVehicle = new BMWVehicleImpl();
    }
    @Test
    public void vehicleDetail() throws Exception{
        iVehicle.vehicleName();
        iVehicle.drivingSpeed();
    }

    @Test
    public void bmwDependenciesInjectionTest()throws Exception{
        iVehicle.drivingSpeed();

    }
}