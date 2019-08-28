package JavaLearn.Bach30.SpringBoot.impl;

import JavaLearn.Bach30.SpringBoot.IEngineProvider;
import org.springframework.stereotype.Component;

@Component("provider")
public class EngineProviderImpl implements IEngineProvider {
    @Override
    public void provider() {
        System.out.println("I provide the best engine for the car....");
    }
}
