package Factories;
import Track.*;

public class TrackFactory {
    public static Track getTrack(String type) {
        if(type.equalsIgnoreCase("Blue Moon Bay Speedway")) {
            return new BlueMoonBaySpeedwayTrack();
        }
        else if(type.equalsIgnoreCase("BB Raceway")) {
            return new BBRacewayTrack();
        }
        else if(type.equalsIgnoreCase("Circuit de Spa-Francorchamps")) {
            return new CircuitDeSpaFrancorchampsTrack();
        }
        else {
            throw new IllegalArgumentException("Invalid Track type: " + type);
        }
    }
}

