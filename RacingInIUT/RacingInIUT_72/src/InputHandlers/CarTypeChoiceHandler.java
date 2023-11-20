package InputHandlers;

import java.util.Scanner;

public class CarTypeChoiceHandler implements InputHandler {
    private InputHandler nextHandler;

    @Override
    public String handleInput(Scanner scanner) {
        System.out.println("--------------------------------------------------");
        System.out.println("Choose a car type ('Coupe', 'Roadster'): ");
        System.out.println("--------------------------------------------------");
        return scanner.nextLine();
    }

    @Override
    public InputHandler setNext(InputHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
