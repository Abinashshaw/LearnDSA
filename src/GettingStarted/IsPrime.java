package GettingStarted;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        boolean isPrime = true;
        int num;
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        int div = 2;
        while(div * div <= num){
            int rem = num % div;
            if (rem == 0){
                isPrime = false;
                break;
            }
            div++;
        }

        if(isPrime){
            System.out.println("Given number "+ num +" is prime");
        }
        else {
            System.out.println("Given number "+ num +" is not prime");
        }
    }
}
