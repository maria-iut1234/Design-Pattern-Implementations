package Racing;
import Car.*;
import Track.*;
import NOS.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public abstract class Race {
    private NOS nos;
    protected String raceType;

    public Race(NOS nos) {
        this.nos = nos;
    }

    public final void race(Car car, Track track) {
        System.out.println("-----Information-----");
        car.carInfo();
        track.trackInfo();
        System.out.println("-----Race Starts-----");
        startCar(car);
        startLine(track);
        accelerateCar(car);
        nos = pitStop(car);
        applyNos(nos);
        finishLine(track);
        stopCar(nos);
        lapTime();
    }

    private void applyNos(NOS nos) {
        nos.applyNOS();
        System.out.println("------------------------------");
    }

    private NOS pitStop(Car car) {
        System.out.println("-----Stopping at pit stop-----");
        car.changeEngineBehavior();
        car.changeTurbochargerBehavior();
        return nos;
    }

    private void lapTime() {
        long randomLapTime = (long) (Math.random() * 60000);

        SimpleDateFormat dateFormat = new SimpleDateFormat("mm:ss.SSS");
        Date date = new Date(randomLapTime);

        System.out.println("Lap Time: " + dateFormat.format(date));
    }

    private void startCar(Car car) {
        System.out.println("Starting " + car.getCarName() + " car...");
    }

    private void stopCar(Car car) {
        System.out.println("Stopping " + car.getCarName() + " car...");
    }

    private void accelerateCar(Car car) {
        System.out.println("Accelerating " + car.getCarName() + " car...");
    }

    protected abstract void startLine(Track track);
    protected abstract void finishLine(Track track);

    public void getRaceInfo() {
        System.out.println("Race Type: " + raceType);
    }
}
