package Java;

import java.util.Scanner;

public class Ques2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num = in.nextInt();

        calcDig(num);
    }

    public static void calcDig(int num)
    {
        if(num<10)
        {
            System.out.println("result = 1");
            System.exit(1);
        }

        int count=0;

        while(num!=0)
        {
            num/=10;
            count++;
        }

        if(count%2==0)
        System.out.println("result = "+ count + "," + count*count);
        else if(count%3==0)
        System.out.println("result = "+ count + "," + count*count*count);
        else if(count%2==0 && count%3==0)
        System.out.println("result = "+ count + "," + count*count);
        else
        System.out.println("result = "+ count + "["+ --count + "]" +","+ count*count);








    }
}
