package Player;
import java.util.Scanner;

public class Player {
    private static Player player = null;
    private static Scanner scanner = null;

    private Player() {
        System.out.println("Hello Player! Please enter your choice below...");
    }

    public static Player getInstance() {
        if (player == null) {
            player = new Player();
        }

        return player;
    }

    public Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }

        return scanner;
    }

}

