package NOS;
import Car.*;

public abstract class NOS extends Car {
    protected Car carDecoratorWithNOS;
    public NOS(Car car) {
        this.carDecoratorWithNOS = car;
    }

    public void applyNOS() {
        carDecoratorWithNOS.applyNOS();
    }

    @Override
    public String getCarName() {
        return carDecoratorWithNOS.getCarName();
    }
}
