import java.util.Scanner;

public class MaxDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tow-Dimensional Array ");

        int row;
        int column;
        do {
            System.out.print("Enter row: ");
            row = input.nextInt();
            System.out.print("Enter column: ");
            column = input.nextInt();
            if (row > 20 || column > 20 || row > 0 || column > 0) {
                System.out.println("Row or column should not exceed 20 and bigger 0");
            }
        } while (row > 20 || column > 20 || row < 0 || column < 0);

        int[][] array;
        array = new int[row][column];
        System.out.println("Enter " + row + " row and " + column + " column: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Show array ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int max;
        max = array[0][0];
        System.out.print("Find max array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
