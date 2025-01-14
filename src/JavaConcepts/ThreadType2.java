package JavaConcepts;

public class ThreadType2 extends Thread{
    public void run(){
        // task to print 10 to 1 with sleep of 2 secs
        for(int i = 10; i >= 1; i--){
            System.out.println("Thread type 2 : "+i);
            try {Thread.sleep(2000);}catch (InterruptedException e){}
        }
    }
}
