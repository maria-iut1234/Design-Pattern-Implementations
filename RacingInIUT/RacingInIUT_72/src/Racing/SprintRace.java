package Racing;

import NOS.NOS;
import Track.*;

public class SprintRace extends Race {

    public SprintRace(NOS nos) {
        super(nos);
        this.raceType = "Sprint Race";
    }
    @Override
    protected void startLine(Track track) {
        System.out.println("Starting at point A of the " + track.getTrackName() + " track...");
    }

    @Override
    protected void finishLine(Track track) {
        System.out.println("Finishing at point B of the " + track.getTrackName() + " track...");
    }
}
