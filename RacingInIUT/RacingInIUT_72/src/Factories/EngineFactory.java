package Factories;

import Engine.*;

public class EngineFactory {
    public static EngineBehavior getEngine(String type) {
        if(type.equalsIgnoreCase("v6")) {
            return new v6Engine();
        }
        else if(type.equalsIgnoreCase("v8")) {
            return new v8Engine();
        }
        else if(type.equalsIgnoreCase("v12")) {
            return new v12Engine();
        }
        else {
            throw new IllegalArgumentException("Invalid Engine type: " + type);
        }
    }
}
