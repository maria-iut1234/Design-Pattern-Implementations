package InputHandlers;

import java.util.Scanner;

public class EngineHandler implements InputHandler{
    private InputHandler nextHandler;
    @Override
    public String handleInput(Scanner scanner) {
        System.out.println("--------------------------------------------------");
        System.out.println("Choose an engine behavior ('v6', 'v8', 'v12'): ");
        System.out.println("--------------------------------------------------");
        return scanner.nextLine();
    }

    @Override
    public InputHandler setNext(InputHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
