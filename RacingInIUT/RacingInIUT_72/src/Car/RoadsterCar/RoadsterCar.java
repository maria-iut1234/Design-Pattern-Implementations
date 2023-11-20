package Car.RoadsterCar;

import Car.*;
import Engine.EngineBehavior;
import Turbocharger.TurbochargerBehavior;

public class RoadsterCar extends Car {
    public RoadsterCar(EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        super(engineBehavior, turbochargerBehavior);
        this.carType = "Roadster";
    }
}
