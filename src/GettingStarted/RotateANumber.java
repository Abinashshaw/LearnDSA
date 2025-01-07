package GettingStarted;

import java.util.Scanner;

public class RotateANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number you want to rotate : ");
        int num = scn.nextInt();
        System.out.println("Enter the number of times you want to rotate : ");
        int noOfTimes = scn.nextInt();

        // Step 1 - find the nos. of digits in the number
        int temp = num;
        int digitsCount = 0;
        while(temp != 0){
            temp /= 10;
            digitsCount++;
        }

        // Step 2 - Every number after rotating digitsCount times becomes same number
        // so we need to rotate the number only those many times which is actually excess
        // to the actual division
        noOfTimes = noOfTimes % digitsCount;
        // if noOfTimes to be rotated is negative then it is actually equals to
        // digitsCount - noOfTimes -1 means rotate 4 times
        if(noOfTimes < 0){
            noOfTimes = digitsCount + noOfTimes;
        }
        // Step 3 - We need to get the digits we want to place ahead
        // We will divide the number with multiplication of 10 times no of Digits to
        // rotated and then we need to multiply it no of times the digit Count of quotient

        int div = 1;
        int mul = 1;

        for(int i=1; i<=digitsCount; i++){
            if(i <= noOfTimes){
                div *= 10;
            }
            else{
                mul *= 10;
            }
        }

        // now the result (((num % div) * mul) + num / div )

        int result;

        int quo = num / div;
        int rem = num % div;

        result = rem * mul + quo;

        System.out.println(result);


    }
}
