package GettingStarted;

import java.util.Scanner;

public class ReverseOfANumber
{
    public static void main(String[] args) {
        System.out.println("Enter a number whose reverse you want : ");

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int rev = 0;
        while(num >= 1){
            int rem = num % 10;
            num = num / 10;
            rev *= 10;
            rev += rem;
        }

        System.out.println(rev);

    }
}
