package JavaConcepts;

public class ThreadType1 implements Runnable{

    public void run(){
        // Task to print 1 to 10 with sleep of 1 second
        for(int i=1; i<=10; i++){
            System.out.println("Thread 1 : "+i);
            try { Thread.sleep(1000); }catch (InterruptedException e){}
        }
    }
}
