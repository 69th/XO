public class Field {

    private static final int FIELD_SIZE = 3;
    private static final char DEFAULT_CELL_VALUE = ' ';
    private static final char X_VALUE = 'X';
    private static final char O_VALUE = 'O';

    private char field[][] = new char[FIELD_SIZE][FIELD_SIZE];

    public Field() {
        for(int i = FIELD_SIZE - 1; i >= 0; i--) {
            for(int j = FIELD_SIZE - 1; j >= 0; j--) {
                field[i][j] = DEFAULT_CELL_VALUE;
            }
        }
    }

    public char getCell(int i, int j) {
        return field[i][j];
    }

    public void setCell(int cell, char symbol) {
        switch (cell) {
            case 1:
                field[0][0] = symbol;
                break;
            case 2:
                field[0][1] = symbol;
                break;
            case 3:
                field[0][2] = symbol;
                break;
            case 4:
                field[1][0] = symbol;
                break;
            case 5:
                field[1][1] = symbol;
                break;
            case 6:
                field[1][2] = symbol;
                break;
            case 7:
                field[2][0] = symbol;
                break;
            case 8:
                field[2][1] = symbol;
                break;
            case 9:
                field[2][2] = symbol;
                break;
        }
    }

    public void printField() {
        for(int i = 0; i < FIELD_SIZE; i++) {
            for(int j = 0; j < FIELD_SIZE; j++) {
                System.out.print("[" + getCell(i, j) + "]");
            }
            System.out.println();
        }
    }

    public static char getDefaultCellValue() {
        return DEFAULT_CELL_VALUE;
    }

    public static char getXValue() {
        return X_VALUE;
    }

    public static char getOValue() {
        return O_VALUE;
    }

}
