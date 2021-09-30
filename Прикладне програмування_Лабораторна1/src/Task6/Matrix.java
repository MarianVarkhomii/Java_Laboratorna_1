package Task6;

import java.util.Scanner;

public class Matrix implements InterfaceMatrix {
    private int row;
    private int column;
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
    public int getRow() {
        return row;
    }
    public int getColumn() { return column; }
    @Override
    public void readMatrix() {
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
    }
    @Override
    public Matrix multiplyMatrix(final Matrix other) {
        if (this.column != other.row) {
            throw new IllegalArgumentException( "column of this matrix is not equal to row "
                    + "of second matrix, cannot multiply");
        }
        final int[][] product = new int[this.row][other.column];
        int sum = 0; for (int i = 0; i < this.row; i++) {
            for(int j = 0; j < other.column; j++) {
                for(int k = 0; k < other.row; k++) {
                    sum = sum + data[i][k] * other.data[k][j];
                }
                product[i][j] = sum;
            }
        }
        return new Matrix(product);
    }
    @Override
    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
            System.out.print(data[i][j] + " ");
        }
            System.out.println();
        }
    }
}
