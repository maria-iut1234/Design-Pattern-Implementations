package Car.RoadsterCar;

import Engine.EngineBehavior;
import Turbocharger.TurbochargerBehavior;

public class FerrariCar extends RoadsterCar{
    public FerrariCar(EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        super(engineBehavior, turbochargerBehavior);
        this.carName = "Ferrari812";
    }
}
