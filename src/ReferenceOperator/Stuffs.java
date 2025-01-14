package ReferenceOperator;

import java.time.LocalDate;

public class Stuffs {

    public static void doStuffs(){
        System.out.println("I am doing stuffs");
        System.out.println("This is second stuff");
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }

    public static void threadTask(){
        for (int i = 1; i <= 10; i++){
            System.out.println("from Static method : "+i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public int printNumber(){
        for (int i = 1; i <= 10; i++){
            System.out.println("from Non Static method : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return 5;
    }
}
