package Track;

public abstract class Track {
    protected String trackLocation;
    protected String trackName;

    public String getTrackName(){
        return trackName;
    }

    public void trackInfo() {
        System.out.println("Track Name: " + trackName);
        System.out.println("Track Location: " + trackLocation);
    }
}

