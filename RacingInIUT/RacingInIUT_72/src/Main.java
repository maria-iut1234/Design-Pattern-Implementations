import Engine.EngineBehavior;
import Factories.*;
import Car.*;
import Player.*;
import Racing.*;
import Track.*;
import InputHandlers.*;
import Turbocharger.*;
import NOS.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the IUT Racing Game!");

        // creating player and scanner instance using Singleton Pattern
        Player player = Player.getInstance();
        Scanner playerScanner = player.getScanner();

        // player input using chain of responsibility
        InputHandler carTypeHandler = new CarTypeChoiceHandler();
        InputHandler carHandler = new CarChoiceHandler();
        InputHandler engineHandler = new EngineHandler();
        InputHandler turbochargerHandler = new TurbochargerHandler();
        InputHandler trackHandler = new TrackChoiceHandler();
        InputHandler NOSHandler = new NOSChoiceHandler();
        InputHandler racingHandler = new RaceChoiceHandler();

        // setting chain of responsibility
        carTypeHandler.setNext(carHandler).setNext(engineHandler).setNext(turbochargerHandler).
                setNext(trackHandler).setNext(NOSHandler).setNext(racingHandler);

        // save player input
        String chosenCarType = carTypeHandler.handleInput(playerScanner);
        String chosenCar = carHandler.handleInput(playerScanner);
        String chosenEngine = engineHandler.handleInput(playerScanner);
        String chosenTurbocharger = turbochargerHandler.handleInput(playerScanner);
        String chosenTrack = trackHandler.handleInput(playerScanner);
        String chosenNOS = NOSHandler.handleInput(playerScanner);
        String chosenRace = racingHandler.handleInput(playerScanner);

        // using factories to get the objects according to player input
        AbstractCarFactory playerCarType = CarFactoryProvider.getCarFactory(chosenCarType);
        EngineBehavior playerEngineChoice = EngineFactory.getEngine(chosenEngine);
        TurbochargerBehavior playerTurbochargerChoice = TurbochargerFactory.getTurbocharger(chosenTurbocharger);
        Car playerCarChoice = playerCarType.getCar(chosenCar, playerEngineChoice, playerTurbochargerChoice);
        Track playerTrackChoice = TrackFactory.getTrack(chosenTrack);
        NOS playerNOSChoice = NOSFactory.getNOS(chosenNOS, playerCarChoice);
        Race playerRaceChoice = RaceFactory.getRace(chosenRace, playerNOSChoice);

        // racing starts
        playerRaceChoice.getRaceInfo();
        playerRaceChoice.race(playerCarChoice, playerTrackChoice);

        // close the scanner
        playerScanner.close();



    }
}