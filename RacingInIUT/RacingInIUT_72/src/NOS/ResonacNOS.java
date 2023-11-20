package NOS;

import Car.Car;

public class ResonacNOS extends NOS{
    public ResonacNOS(Car car) {
        super(car);
    }

    @Override
    public void applyNOS() {
        System.out.println("Applying Resonac NOS...");
        carDecoratorWithNOS.applyNOS();
    }
}
