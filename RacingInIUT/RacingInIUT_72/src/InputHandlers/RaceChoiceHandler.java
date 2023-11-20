package InputHandlers;

import java.util.Scanner;

public class RaceChoiceHandler implements InputHandler {
    private InputHandler nextHandler;

    @Override
    public String handleInput(Scanner scanner) {
        System.out.println("--------------------------------------------------");
        System.out.println("Choose a race type ('Sprint', 'Circuit'): ");
        System.out.println("--------------------------------------------------");
        return scanner.nextLine();
    }

    @Override
    public InputHandler setNext(InputHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
