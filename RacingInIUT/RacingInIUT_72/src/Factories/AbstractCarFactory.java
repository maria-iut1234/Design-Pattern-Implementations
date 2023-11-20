package Factories;
import Car.*;
import Engine.EngineBehavior;
import Turbocharger.TurbochargerBehavior;

public abstract class AbstractCarFactory {
    public abstract Car getCar(String type, EngineBehavior engineBehavior, TurbochargerBehavior turbochargerBehavior);
}
