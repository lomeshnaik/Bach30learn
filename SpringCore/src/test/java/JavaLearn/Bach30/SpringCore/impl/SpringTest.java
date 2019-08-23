package JavaLearn.Bach30.SpringCore.impl;

import JavaLearn.Bach30.SpringCore.IVehicle;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testSpringBean() throws Exception{

        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IVehicle vehicle = (IVehicle) context.getBean("vehicle");
        //vehicle.drivingSpeed();
        System.out.println(vehicle.hashCode());

        vehicle = (IVehicle) context.getBean("vehicle");
        System.out.println(vehicle.hashCode());
    }


}
