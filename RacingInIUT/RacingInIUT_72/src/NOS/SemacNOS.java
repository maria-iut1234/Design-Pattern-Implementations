package NOS;

import Car.Car;
import Engine.EngineBehavior;
import Turbocharger.TurbochargerBehavior;

public class SemacNOS extends NOS{
    public SemacNOS(Car car) {
        super(car);
    }

    @Override
    public void applyNOS() {
        System.out.println("Applying Semac NOS...");
        carDecoratorWithNOS.applyNOS();
    }
}
