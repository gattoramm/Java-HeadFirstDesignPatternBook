package Fundamentals.Main.Optional_Task_2;

import java.util.Scanner;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M
 * с помощью генератора случайных чисел (класс Random).
 *
 *  Упорядочить строки матрицы в порядке возрастания
 *  значений элементов k-го столбца.
 */

public class Ex1_1 {
    // замена строк
    public static void changeRowsOfMatrix(int row1, int row2, int[][] matrix) {
        for (int i = 0; i <  matrix[0].length; i++) {
            int tmp = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = tmp;
        }
    }

    public static void sortedColumnOfMatrix(int column, int[][] matrix){
        // сортировка вставкой
        for (int out = 1; out < matrix[0].length; out++) {
            int in = out;
            int tempValueRowColumn = matrix[out][column];

            while (in > 0 && matrix[in-1][column] >= tempValueRowColumn) {
                changeRowsOfMatrix(in, in - 1, matrix);
                --in;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int out = 0; out <  matrix[0].length; out++) {
            for (int in = 0; in <  matrix[0].length; in++) {
                System.out.print("a[" + (out + 1) + "][" + (in + 1) + "]=" + matrix[out][in] + "\t");
            }
            System.out.println();
        }
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert n: ");
        int inputValue = scanner.nextInt();

        int[][] matrix = new int[inputValue][inputValue];
        int M = 5_000_000;

        for (int out = 0; out < inputValue; out++) {
            for (int in = 0; in < inputValue; in++) {
                matrix[out][in] = (int) (Math.random() * (2 * M + 1)) - M;
            }
        }
        System.out.println("Before:");
        printMatrix(matrix);
        sortedColumnOfMatrix(0, matrix);
        System.out.println("After:");
        printMatrix(matrix);
    }
}
