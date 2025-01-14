package JavaConcepts;

public class Producer extends Thread{
    Company c;
    public Producer(Company c){
        this.c = c;
    }

    public void run(){
        int i = 1;
        while(true){
            try {
                c.produce_Item(i);
                Thread.sleep(1000);
            } catch(InterruptedException e){}
            i++;
        }
    }
}
