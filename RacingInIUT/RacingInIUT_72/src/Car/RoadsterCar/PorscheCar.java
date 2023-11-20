package Car.RoadsterCar;

import Engine.EngineBehavior;
import Turbocharger.TurbochargerBehavior;

public class PorscheCar extends RoadsterCar{
    public PorscheCar(EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        super(engineBehavior, turbochargerBehavior);
        this.carName = "PorscheBoxster";
    }
}
