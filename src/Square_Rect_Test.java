import java.util.Scanner;

public class Square_Rect_Test {
    static int totalSquare(int row, int column) {
        if (column < row) {
            int a = row;
            row = column;
            column = a;
        }
        return row * (row + 1) * (2 * row + 1) / 6 + (column - row) * row * (row + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of rows");
        int row = scanner.nextInt();
        System.out.println("Enter the total number of columns");
        int column = scanner.nextInt();
        //*************************************************************************************************************
        //                      Counting the square
        //*************************************************************************************************************
        System.out.println("Total square contain in the grid is " + totalSquare(row, column));
        //*************************************************************************************************************
        //                      Counting the rectangle
        //*************************************************************************************************************
        int sum = 0;
        int sum1 = 0;
        int rect;
        for (int i = 1; i <= row; i++) {
            sum = sum + i;
        }
        for (int j = 1; j <= column; j++) {
            sum1 = sum1 + j;
        }
        rect = sum * sum1;
        System.out.println("Total rectangle contain in the grid is " + rect);
    }
}