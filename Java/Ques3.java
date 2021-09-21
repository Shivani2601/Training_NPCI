package Java;

import java.util.Scanner;

public class Ques3 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print(" Enter a number : ");

        if(in.hasNextShort())
        System.out.print("Short");

        else if(in.hasNextInt())
        System.out.println("Int");

        else if(in.hasNextLong())
        System.out.println("Long");

        else if(in.hasNextFloat())
        System.out.println("Float");

        else if(in.hasNextDouble())
        System.out.println("Double");


    }
}
