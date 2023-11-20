package InputHandlers;
import java.util.Scanner;

public class CarChoiceHandler implements InputHandler {
    private InputHandler nextHandler;

    @Override
    public String handleInput(Scanner scanner) {
        System.out.println("--------------------------------------------------");
        System.out.println("Choose a car type accordingly: ");
        System.out.println("(Coupe Cars: 'Toyota', 'Subaru')");
        System.out.println("(Roadster Cars: 'Ferrari', 'Porsche')");
        System.out.println("--------------------------------------------------");
        return scanner.nextLine();
    }

    @Override
    public InputHandler setNext(InputHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
