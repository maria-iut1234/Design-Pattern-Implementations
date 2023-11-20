package Factories;
import Car.*;
import Car.RoadsterCar.*;
import Engine.*;
import Turbocharger.*;

public class RoadsterCarFactory extends AbstractCarFactory{
    @Override
    public Car getCar(String type, EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        if(type.equalsIgnoreCase("Porsche")) {
            return new PorscheCar(engineBehavior, turbochargerBehavior);
        }
        else if(type.equalsIgnoreCase("Ferrari")) {
            return new FerrariCar(engineBehavior, turbochargerBehavior);
        }
        else {
            throw new IllegalArgumentException("Invalid Roadster Car type: " + type);
        }
    }
}
