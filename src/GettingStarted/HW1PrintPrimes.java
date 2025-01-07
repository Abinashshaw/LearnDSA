package GettingStarted;

import java.util.Scanner;

public class HW1PrintPrimes {

    public static void main(String[] args) {
//        System.out.println("Enter till how many Number you want to check for Prime : ");
//        Scanner scn = new Scanner(System.in);
//        int num = scn.nextInt();
//        for(int i=2; i<=num; i++){
//            checkPrime(i);
//        }

        System.out.println("Enter the lowest value from where you want to check ");
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        System.out.println("Enter the highest value till where you want to check ");
        int high = scn.nextInt();
        for(int i=low; i<=high; i++){
            checkPrime(i);
        }
    }

    private static void checkPrime(int num) {
        boolean isPrime = true;
        int div = 2;
        while(div * div <= num){
            int rem = num % div;
            if(rem == 0){
                isPrime = false;
                break;
            }
            div++;
        }

//        if(isPrime){
//            System.out.println("number "+ num +" is prime");
//        }
//        else {
//            System.out.println("number "+ num +" is not prime");
//        }
        if(isPrime){
            System.out.println(num);
        }
    }
}
