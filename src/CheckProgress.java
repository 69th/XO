public class CheckProgress {

    public static String check(Field field) {
        String progress = "process";

        if(field.field[0][0] == field.field[0][1] && field.field[0][1] == field.field[0][2] && field.field[0][0] != ' ') {
            progress = "winner";
        } else if(field.field[1][0] == field.field[1][1] && field.field[1][1] == field.field[1][2] && field.field[1][0] != ' ') {
            progress = "winner";
        } else if(field.field[2][0] == field.field[2][1] && field.field[2][1] == field.field[2][2] && field.field[2][0] != ' ') {
            progress = "winner";
        } else if(field.field[0][0] == field.field[1][0] && field.field[1][0] == field.field[2][0] && field.field[0][0] != ' ') {
            progress = "winner";
        } else if(field.field[0][1] == field.field[1][1] && field.field[1][1] == field.field[2][1] && field.field[0][1] != ' ') {
            progress = "winner";
        } else if(field.field[0][2] == field.field[1][2] && field.field[1][2] == field.field[2][2] && field.field[0][2] != ' ') {
            progress = "winner";
        } else if(field.field[0][0] == field.field[1][1] && field.field[1][1] == field.field[2][2] && field.field[0][0] != ' ') {
                   progress = "winner";
        } else if(field.field[2][0] == field.field[1][1] && field.field[1][1] == field.field[0][2] && field.field[2][0] != ' ') {
                   progress = "winner";
        } else {
               progress = "process";
               }
        return progress;

    }

}
