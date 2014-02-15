public class Field {

    private static final int FIELD_SIZE = 3;
    private static final char DEFAULT_CELL_VALUE = ' ';

    public char field[][] = new char[FIELD_SIZE][FIELD_SIZE];

    public Field() {
        for(int i = FIELD_SIZE - 1; i >= 0; i--) {
            for(int j = FIELD_SIZE - 1; j >= 0; j--) {
                field[i][j] = DEFAULT_CELL_VALUE;
            }
        }
    }

    public char[][] getField() {
        return field;
    }

    public void setField(char[][] field) {
        this.field = field;
    }
}
