package Java;

import java.util.Scanner;

public class Ques4 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int n=in.nextInt();
        revFib(n);
    }

    public static void revFib(int n)
    {
        int arr[]= new int[n];
        arr[0]=0;
        arr[1]=1;

        for(int i=2; i<n; i++)
        arr[i]=arr[i-2]+arr[i-1];

        for(int i=n-1; i>=0; i--)
        System.out.print(arr[i]+ " ");

    }
    
}
