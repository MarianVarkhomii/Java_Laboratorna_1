package Task6;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Input matrix 1 from the keyboard ");
        System.out.print("Input the number of rows ");
        final int row1 = scanner.nextInt();
        System.out.print("Input the number of rows of columns ");
        final int column1 = scanner.nextInt();
        System.out.println("\n Input elements matrix:");
        final Matrix matrixFirst = new Matrix (row1, column1);
        matrixFirst.readMatrix ();

        System.out.println("Input matrix 2 from the keyboard  ");
        System.out.print("Input the number of rows ");
        final int row2 = scanner.nextInt();
        System.out.print("Input the number of rows of columns ");
        final int column2 = scanner.nextInt();
        System.out.println("\n Input elements matrix:");
        final Matrix matrixSecond = new Matrix (row2, column2);

        matrixSecond.readMatrix ();

        final Matrix matrixMultiply = matrixFirst.multiplyMatrix (matrixSecond);

        System.out.println("Matrix 1:");
        matrixFirst.printMatrix ();
        System.out.println("Matrix 2:");
        matrixSecond.printMatrix ();
        System.out.println("Product matrix: ");
        matrixMultiply.printMatrix ();
        scanner.close();
    }

}
