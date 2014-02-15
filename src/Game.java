import java.io.*;

public class Game {

    Field field = new Field();

    CheckProgress checker = new CheckProgress();

    private String progress = "process";

    public void game() throws IOException {

        boolean stroke = true;
        char value = 'X';



        while(progress == "process") {

            //X - true, O - false
            if(stroke) {
                value = 'X';
            } else {
                value = 'O';
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input a number");
            int position = Integer.parseInt(br.readLine());

            switch (position) {
                case 1:
                    System.out.println("in case 1");
                    field.field[0][0] = value;
                    break;
                case 2:
                    field.field[0][1] = value;
                    break;
                case 3:
                    field.field[0][2] = value;
                    break;
                case 4:
                    field.field[1][0] = value;
                    break;
                case 5:
                    field.field[1][1] = value;
                    break;
                case 6:
                    field.field[1][2] = value;
                    break;
                case 7:
                    field.field[2][0] = value;
                    break;
                case 8:
                    field.field[2][1] = value;
                    break;
                case 9:
                    field.field[2][2] = value;
                    break;
            }


            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print("[" + field.field[i][j] + "]");
                }
                System.out.println();
            }

            stroke = !stroke;

            progress = checker.check(field);

        }

        System.out.println("Winner is: " + value);
    }

}
