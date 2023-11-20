package InputHandlers;
import java.util.Scanner;

public interface InputHandler {
    String handleInput(Scanner scanner);
    InputHandler setNext(InputHandler nextHandler);
}
