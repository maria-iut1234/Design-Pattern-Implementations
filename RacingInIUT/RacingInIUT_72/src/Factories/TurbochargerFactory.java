package Factories;

import Turbocharger.*;

public class TurbochargerFactory {
    public static TurbochargerBehavior getTurbocharger(String type) {
        if(type.equalsIgnoreCase("Alpine")) {
            return new AlpineTurbocharger();
        }
        else if(type.equalsIgnoreCase("Cummins")) {
            return new CumminsTurbocharger();
        }
        else if(type.equalsIgnoreCase("Honeywell")) {
            return new HoneywellTurbocharger();
        }
        else {
            throw new IllegalArgumentException("Invalid Turbocharger type: " + type);
        }
    }
}
