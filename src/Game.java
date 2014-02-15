import java.io.*;

public class Game {

    private static final String GAME_IN_PROCESS = "process";
    private static final String WINNER = "winner";

    Field field = new Field();
    CheckProgress checker = new CheckProgress();
    private String progress = GAME_IN_PROCESS;
    int position;
    boolean stroke = true;
    char value = field.getXValue();

    public void game() {

        System.out.println("Hello! First move for X.");

        while(progress == GAME_IN_PROCESS) {

            determineStroke();

            try {
            position = move();
            } catch (IOException e) {
                System.out.println("IOException: " + e);
            }

            field.setCell(position, value);
            field.printField();
            invertStroke();
            progress = checker.check(field);
        }
        System.out.println("Winner is: " + value);
    }

    private int move() throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a number of cell: ");
        return Integer.parseInt(br.readLine());
    }

    private void determineStroke() {
        if(stroke) {
            value = field.getXValue();
        } else {
            value = field.getOValue();
        }
    }

    private void invertStroke() {
        stroke = !stroke;
    }

    public static String getGameInProcess() {
        return GAME_IN_PROCESS;
    }

    public static String getWinner() {
        return WINNER;
    }
}
