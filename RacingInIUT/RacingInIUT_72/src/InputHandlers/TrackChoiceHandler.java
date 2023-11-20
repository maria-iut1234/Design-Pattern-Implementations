package InputHandlers;

import java.util.Scanner;

public class TrackChoiceHandler implements InputHandler {
    private InputHandler nextHandler;

    @Override
    public String handleInput(Scanner scanner) {
        System.out.println("--------------------------------------------------");
        System.out.println("Choose a track ('Blue Moon Bay Speedway', 'BB Raceway', 'Circuit de Spa-Francorchamps'): ");
        System.out.println("--------------------------------------------------");
        return scanner.nextLine();
    }

    @Override
    public InputHandler setNext(InputHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
