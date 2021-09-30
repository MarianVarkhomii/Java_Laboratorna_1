package Task5;

import java.util.Scanner;

public class Export {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Input matrix from the keyboard ");
        System.out.println("Input number of rows of columns ");
        final int row = scanner.nextInt();
        System.out.println("Input number of columns");
        final int column = scanner.nextInt();

        System.out.println("\n Input elements matrix ");
        final Matrix matrix = new Matrix(row, column);
        matrix.read(scanner);
        System.out.println("Matrix: ");
        matrix.printMatrix();
        matrix.exportMatrix();
        System.out.println("Transported matrix: ");
        matrix.printMatrix();
        scanner.close();
    }
}
