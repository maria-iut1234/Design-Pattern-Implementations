package Factories;

import Racing.*;
import NOS.*;

public class RaceFactory {
    public static Race getRace(String type, NOS nos) {
        if(type.equalsIgnoreCase("Circuit")) {
            return new CircuitRace(nos);
        }
        else if(type.equalsIgnoreCase("Sprint")) {
            return new SprintRace(nos);
        }
        else {
            throw new IllegalArgumentException("Invalid Race type: " + type);
        }
    }
}
