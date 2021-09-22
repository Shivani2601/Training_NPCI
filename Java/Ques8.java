package Java;

import java.util.Scanner;

public class Ques8 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows and cols");
        int rows= in.nextInt();
        int col= in.nextInt();

        int matrix1[][]= new int[rows][col];
        int matrix2[][]= new int[rows][col];

        System.out.println("Enter elements of first matrix");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            matrix1[i][j]=in.nextInt();
        }

        System.out.println("Enter elements of second matrix");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            matrix2[i][j]=in.nextInt();
        }

        System.out.println("OUTPUT : ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(matrix1[i][j]==matrix2[i][j])
                System.out.print("0 ");
                else
                System.out.print(matrix1[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
