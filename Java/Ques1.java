package Java;
import java.util.Scanner;

public class Ques1 {

        public static void main(String[] args) {

            Scanner in= new Scanner(System.in);

            int first = in.nextInt();
            int second = in.nextInt();

            if(second%first==0)    //multiple
            {
                if(second==first*first)
                System.out.println(second + " is square and multiple of "+ first);
                else
                System.out.println(second + " is a multiple of "+ first + " = "+ second/first + "s of " + first);

            }
            else
            System.out.println(second + " is neither square nor multiple of "+ first);



             
    }
    
}
