package Task5;

import java.util.Scanner;

public class Matrix {
    private final int row;
    private final int column;
    private int[][] data;

    public Matrix(final int row, final int column) {
        this.row = row;
        this.column = column;
        data = new int[row][column];
    }
    public Matrix(final int[][] data) {
        this.data = data;
        this.row = data.length;
        this.column = data[0].length;
    }

    public int getRow() { return row; }
    public int getColumn() {
        return column;
    }
    public void read(final Scanner s) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                data[i][j] = s.nextInt();
            }
        }
    }
    public void exportMatrix() {
        final int[][] temp = new int[this.column][this.row];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                temp[j][i] = data[i][j];
            }
        }
        data = temp;
    }
    public void printMatrix() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
