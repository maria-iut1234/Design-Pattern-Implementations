package Factories;
import Car.*;
import Car.CoupeCar.*;
import Engine.EngineBehavior;
import Turbocharger.TurbochargerBehavior;

public class CoupeCarFactory extends AbstractCarFactory{
    @Override
    public Car getCar(String type, EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        if(type.equalsIgnoreCase("Toyota")) {
            return new ToyotaCar(engineBehavior, turbochargerBehavior);
        }
        else if(type.equalsIgnoreCase("Subaru")) {
            return new SubaruCar(engineBehavior, turbochargerBehavior);
        }
        else {
            throw new IllegalArgumentException("Invalid Coupe Car type: " + type);
        }
    }
}
