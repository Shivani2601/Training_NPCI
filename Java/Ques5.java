package Java;

import java.util.Scanner;


public class Ques5 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows=in.nextInt();

        System.out.println("Enter number of columns : ");
        int col=in.nextInt();

        createMatrix( rows, col);

    }
    

    public static void createMatrix(int m, int n)
    {
        int[][] matrix = new int[m][n];
        int ele=0;
        
       for(int i=1; i<=m; i++)
       {
           if(i%2!=0)
           {
               for(int j=0; j<n; j++)
               matrix[i-1][j]=++ele;
           }
           else
           {
               for(int j=n-1; j>=0; j--)
               matrix[i-1][j]=++ele;
           }

       }

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            System.out.print(matrix[i][j]+" " );

            System.out.println();
        }

    }
}
