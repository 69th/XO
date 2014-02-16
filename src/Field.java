public class Field {

    private static final int FIELD_SIZE = 3;
    private static final char DEFAULT_CELL_VALUE = ' ';
    private static final char X_VALUE = 'X';
    private static final char O_VALUE = 'O';
    private static final String CELL_IS_OCCUPIED = "This cell is occupied. You miss the move.";

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
                if(field[0][0] == DEFAULT_CELL_VALUE) {
                    field[0][0] = symbol;
                } else {
                    System.out.println(CELL_IS_OCCUPIED);
                }
                break;
            case 2:
                if(field[0][1] == DEFAULT_CELL_VALUE) {
                    field[0][1] = symbol;
                } else {
                    System.out.println(CELL_IS_OCCUPIED);
                }
                break;
            case 3:
                if(field[0][2] == DEFAULT_CELL_VALUE) {
                    field[0][2] = symbol;
                } else {
                    System.out.println(CELL_IS_OCCUPIED);
                }
                break;
            case 4:
                if(field[1][0] == DEFAULT_CELL_VALUE) {
                    field[1][0] = symbol;
                } else {
                    System.out.println(CELL_IS_OCCUPIED);
                }
                break;
            case 5:
                if(field[1][1] == DEFAULT_CELL_VALUE) {
                    field[1][1] = symbol;
                } else {
                    System.out.println(CELL_IS_OCCUPIED);
                }
                break;
            case 6:
                if(field[1][2] == DEFAULT_CELL_VALUE) {
                    field[1][2] = symbol;
                } else {
                    System.out.println(CELL_IS_OCCUPIED);
                }
                break;
            case 7:
                if(field[2][0] == DEFAULT_CELL_VALUE) {
                    field[2][0] = symbol;
                } else {
                    System.out.println(CELL_IS_OCCUPIED);
                }
                break;
            case 8:
                if(field[2][1] == DEFAULT_CELL_VALUE) {
                    field[2][1] = symbol;
                } else {
                    System.out.println(CELL_IS_OCCUPIED);
                }
                break;
            case 9:
                if(field[2][2] == DEFAULT_CELL_VALUE) {
                    field[2][2] = symbol;
                } else {
                    System.out.println(CELL_IS_OCCUPIED);
                }
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
