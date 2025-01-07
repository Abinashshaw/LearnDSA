package GettingStarted;

import java.util.Scanner;

public class DigitsOfANumber {

    public static void main(String[] args) {
        System.out.println("Enter number for which you want to calculate digits");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int div = 1;
        int temp = num;
        while(temp >= 10){
            temp /= 10;
            div *= 10;
        }

        while(div >= 1){
            int quo = num / div;
            System.out.println(quo);
            num = num % div;
            div /= 10;
        }

    }



}
