public class CheckProgress {

    public static String check(Field field) {

        String progress;

               if(field.getCell(0, 0) == field.getCell(0, 1) && field.getCell(0, 1) == field.getCell(0, 2) && field.getCell(0, 0) != Field.getDefaultCellValue()) {
            progress = Game.getWinner();
        } else if(field.getCell(1, 0) == field.getCell(1, 1) && field.getCell(1, 1) == field.getCell(1, 2) && field.getCell(1, 0) != Field.getDefaultCellValue()) {
            progress = Game.getWinner();
        } else if(field.getCell(2, 0) == field.getCell(2, 1) && field.getCell(2, 1) == field.getCell(2, 2) && field.getCell(2, 0) != Field.getDefaultCellValue()) {
            progress = Game.getWinner();
        } else if(field.getCell(0, 0) == field.getCell(1, 0) && field.getCell(1, 0) == field.getCell(2, 0) && field.getCell(0, 0) != Field.getDefaultCellValue()) {
            progress = Game.getWinner();
        } else if(field.getCell(0, 1) == field.getCell(1, 1) && field.getCell(1, 1) == field.getCell(2, 1) && field.getCell(0, 1) != Field.getDefaultCellValue()) {
            progress = Game.getWinner();
        } else if(field.getCell(0, 2) == field.getCell(1, 2) && field.getCell(1, 2) == field.getCell(2, 2) && field.getCell(0, 2) != Field.getDefaultCellValue()) {
            progress = Game.getWinner();
        } else if(field.getCell(0, 0) == field.getCell(1, 1) && field.getCell(1, 1) == field.getCell(2, 2) && field.getCell(0, 0) != Field.getDefaultCellValue()) {
            progress = Game.getWinner();
        } else if(field.getCell(2, 0) == field.getCell(1, 1) && field.getCell(1, 1) == field.getCell(0, 2) && field.getCell(2, 0) != Field.getDefaultCellValue()) {
            progress = Game.getWinner();
        } else
            progress = Game.getGameInProcess();

        return progress;

    }

}
