package InputHandlers;

import java.util.Scanner;

public class NOSChoiceHandler implements InputHandler{
    private InputHandler nextHandler;
    @Override
    public String handleInput(Scanner scanner) {
        System.out.println("--------------------------------------------------");
        System.out.println("Choose a NOS car decorator ('Resonac', 'Semac'): ");
        System.out.println("--------------------------------------------------");
        return scanner.nextLine();
    }

    @Override
    public InputHandler setNext(InputHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
