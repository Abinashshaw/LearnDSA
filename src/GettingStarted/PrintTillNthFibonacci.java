package GettingStarted;

import java.util.Scanner;

public class PrintTillNthFibonacci {
    public static void main(String[] args) {
        int a = 0; //first Fibonacci
        int b = 1; //Second Fibonacci
        // next Fibonacci number will be sum of last two Fibonacci and this pattern will be followed
        System.out.println("Enter how many Fibonacci numbers you want to show : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int idx = 1;
        while(idx <= n){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
            idx++;
        }
    }
}
