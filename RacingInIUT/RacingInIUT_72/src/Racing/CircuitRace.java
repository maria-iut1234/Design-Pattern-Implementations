package Racing;

import NOS.NOS;
import Track.*;

public class CircuitRace extends Race {

    public CircuitRace(NOS nos) {
        super(nos);
        this.raceType = "Circuit Race";
    }
    @Override
    protected void startLine(Track track) {
        System.out.println("Starting at point A of the " + track.getTrackName() + " track...");
    }

    @Override
    protected void finishLine(Track track) {
        System.out.println("Finishing at point A of the " + track.getTrackName() + " track...");
    }
}
