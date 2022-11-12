package Blue_Print_of_SqandRec;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total number of rows");
        int row= scanner.nextInt();

        System.out.println("Enter the total number of columns");
        int column= scanner.nextInt();
        int sum=0;
        int sum1=0;
        int rect;
        for (int i = 1; i <=row ; i++) {
            sum=sum+i;
        }
        for (int j = 1; j <=column ; j++) {
            sum1=sum1+j;
        }
        rect=sum*sum1;
        System.out.println("Total rectangle contain in the block is "+rect);
    }
}
