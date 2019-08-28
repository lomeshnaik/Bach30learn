package JavaLearn.Bach30.SpringBoot.impl;

import JavaLearn.Bach30.SpringBoot.IEngineProvider;
import JavaLearn.Bach30.SpringBoot.IVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("BMWVehicle")
public class BMWVehicleImpl implements IVehicle {

  @Autowired
          @Qualifier("provider")
  IEngineProvider engineProvider;

    @Override
    public void drivingSpeed() {
        System.out.println("The Driving Speed of BMW Vehicle is 160 Mph");
       // iEngineProvider =new EngineProviderImpl();
        engineProvider.provider();
    }

    @Override
    public void vehicleName() {
        System.out.println("Vehicle Name is BMW....");
    }
    public void setEngineProvider(IEngineProvider engineProvider) {
        this.engineProvider = engineProvider;
    }

}
