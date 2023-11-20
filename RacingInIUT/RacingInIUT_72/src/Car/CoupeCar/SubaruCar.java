package Car.CoupeCar;

import Engine.EngineBehavior;
import Turbocharger.TurbochargerBehavior;

public class SubaruCar extends CoupeCar{
    public SubaruCar(EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        super(engineBehavior, turbochargerBehavior);
        this.carName = "SubaruBRZ";
    }
}
