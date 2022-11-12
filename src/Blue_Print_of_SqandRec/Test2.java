package Blue_Print_of_SqandRec;

import java.util.Scanner;


public class Test2 {
    static  int totalSquare(int row,int column){
        if (column<row) {
            int a=row;
            row=column;
            column=a;
        }
        return row*(row+1)*(2*row+1)/6+(column-row)*row*(row+1)/2;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of rows");
        int row = scanner.nextInt();
        System.out.println("Enter the total number of columns");
        int column= scanner.nextInt();
        System.out.println("Total square is "+totalSquare(row,column));
      }
}
