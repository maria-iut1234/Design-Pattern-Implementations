package Car;

import Engine.*;
import Turbocharger.*;

public abstract class Car {
    protected String carType;
    protected String carName;
    protected EngineBehavior engineBehavior;
    protected TurbochargerBehavior turbochargerBehavior;

    public Car(EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        this.engineBehavior = engineBehavior;
        this.turbochargerBehavior = turbochargerBehavior;
    }

    public Car() {

    }

    public String getCarName(){
        return carName;
    }
    public void carInfo() {
        System.out.println("Car Type: " + carType);
        System.out.println("Car Name: " + carName);
    }

    public void applyNOS() {}
    public void changeEngineBehavior() {
        engineBehavior.changeEngineBehavior();
    }

    public void changeTurbochargerBehavior() {
        turbochargerBehavior.changeTurbochargerBehavior();
    }
}

