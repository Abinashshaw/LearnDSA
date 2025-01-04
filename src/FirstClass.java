import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hare Krishna");
//
//        double firstDouble = 20.00;
//        double secondDouble = 80.00;
//        double result = (20.00 + 80.00) * 100.00;
//        result = result % 40.00;
//        boolean isDivisible = (result == 0.00) ? true : false;
//        if(!isDivisible){
//            System.out.println("Got Some remainder");
//        }

        System.out.println("Please enter a number : ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int i = 1;
        while(i <= num){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            }
            else{
                System.out.println(i + " is odd");
            }
            i++;
        }
    }
}
