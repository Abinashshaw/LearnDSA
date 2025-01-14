package JavaConcepts;

public class Consumer extends Thread {
    Company c;
    public Consumer(Company c){
        this.c = c;
    }

    public void run(){
        while(true) {
            try {
                c.consume_Item();
                Thread.sleep(2000);
            } catch(InterruptedException e){}
        }
    }
}
