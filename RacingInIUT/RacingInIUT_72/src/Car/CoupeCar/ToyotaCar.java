package Car.CoupeCar;

import Engine.EngineBehavior;
import Turbocharger.TurbochargerBehavior;

public class ToyotaCar extends CoupeCar{

    public ToyotaCar(EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        super(engineBehavior, turbochargerBehavior);
        this.carName = "ToyotaGR86";
    }
}
