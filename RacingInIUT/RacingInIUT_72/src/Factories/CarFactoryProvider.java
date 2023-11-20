package Factories;

public class CarFactoryProvider {
    public static AbstractCarFactory getCarFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Coupe")) {
            return new CoupeCarFactory();
        } else if(factoryType.equalsIgnoreCase("Roadster")) {
            return new RoadsterCarFactory();
        } else {
            throw new IllegalArgumentException("Invalid Factory type: " + factoryType);
        }
    }
}

