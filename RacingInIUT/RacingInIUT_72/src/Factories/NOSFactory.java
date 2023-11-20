package Factories;

import NOS.*;
import Car.*;

public class NOSFactory {
    public static NOS getNOS(String type, Car car) {
        if(type.equalsIgnoreCase("Resonac")) {
            return new ResonacNOS(car);
        }
        else if(type.equalsIgnoreCase("Semac")) {
            return new SemacNOS(car);
        }
        else {
            throw new IllegalArgumentException("Invalid Track type: " + type);
        }
    }
}
