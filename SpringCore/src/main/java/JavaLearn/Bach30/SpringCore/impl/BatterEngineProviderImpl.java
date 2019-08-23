package JavaLearn.Bach30.SpringCore.impl;

import JavaLearn.Bach30.SpringCore.IEngineProvider;
import org.springframework.stereotype.Component;

@Component("batter")
public class BatterEngineProviderImpl implements IEngineProvider {
    @Override
    public void provider() {
        System.out.println("I provide the best engine for the car with Service....");
    }
}
