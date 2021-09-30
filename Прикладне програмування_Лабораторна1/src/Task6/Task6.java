package Task6;

public class Task6 {
    public static void main(String[] args) {
        final int [][] array1 = {
                {4, 6, 8},
                {3, 5, 7, 2},
                {-6, 22, 12}
        };
        final int[][] array2 = {
                {-6, 7, 8, 3},
                {4, 1, 4, 9},
                {-22, 4, 5, -13}
        };
        final Task6 matrix = new Task6();
        System.out.println("Multiply matrix");
        System.out.println("Matrix 1");
        matrix.printMatrix (array1);
        System.out.println("\nMatrix 2");
        matrix.printMatrix (array2);
        System.out.println("\nMatrix multiplied");
        matrix.printMatrix(matrix.multiplication(array1, array2));

    }
    private void printMatrix(final int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j] + " ");
                System.out.println();
            }
        }
    }
    private int[][] multiplication(final int[][] array1, final int[][] array2) {
        int row1, row2, column1, column2;
        row1 = array1.length;
        row2 = array2.length;
        column1 = array1[0].length;
        column2 = array2[0].length;
        int[][] result;
        if (column1 != row2) {
            System.out.println("Error!");
            result = new int[0][0];
        }
        else {
            result = new int[row1][column2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < column1; k++) {
                        result[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
        }
        return result;
    }
}
