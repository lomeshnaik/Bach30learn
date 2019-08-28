package JavaLearn.Bach30.SpringBoot.impl;

import JavaLearn.Bach30.SpringBoot.IVehicle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BMWVehicleImplTest {
    @Autowired
    @Qualifier("BMWVehicle")
    IVehicle iVehicle;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void drivingSpeed() {
        iVehicle.drivingSpeed();
    }
}