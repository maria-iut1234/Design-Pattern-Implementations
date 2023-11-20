package Car.CoupeCar;

import Car.*;
import Engine.EngineBehavior;
import Turbocharger.TurbochargerBehavior;

public abstract class CoupeCar extends Car {
    public CoupeCar(EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior) {
        super(engineBehavior, turbochargerBehavior);
        this.carType = "Coupe";
    }
}

