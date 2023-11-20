package InputHandlers;

import java.util.Scanner;

public class TurbochargerHandler implements InputHandler{
    private InputHandler nextHandler;
    @Override
    public String handleInput(Scanner scanner) {
        System.out.println("--------------------------------------------------");
        System.out.println("Choose a turbocharger behavior ('Alpine', 'Cummins', 'Honeywell'): ");
        System.out.println("--------------------------------------------------");
        return scanner.nextLine();
    }

    @Override
    public InputHandler setNext(InputHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
