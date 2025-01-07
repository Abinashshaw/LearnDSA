package GettingStarted;

import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        int inv = 0;
        System.out.println("Enter the number you want inverse : ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int pos = 1;
        while(num >= 1){
            int rem = num % 10;
            inv += pos * (int)Math.pow(10, rem-1);
            pos++;
            num /= 10;
        }

        System.out.println(inv);
    }
}
