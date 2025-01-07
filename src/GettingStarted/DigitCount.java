package GettingStarted;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        // constraint 1 <= digit < 10^9 --> digit given is an INTEGER
        System.out.println("Enter the Digit : ");
        Scanner scn = new Scanner(System.in);
        int digit = scn.nextInt();
        // 65897451 --> 8 digits
        int count = 0;
        while(digit > 0){
            digit /= 10;
            count++;
        }

        System.out.println(count);
    }

}
