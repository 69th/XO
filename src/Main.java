import java.io.*;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        try {
        game.game();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}