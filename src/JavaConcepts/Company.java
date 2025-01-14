package JavaConcepts;

public class Company {
    int n;
    boolean f = false;
    // if f is false then producer will produce and if f is true consumer will consume

    synchronized public void produce_Item(int i) throws InterruptedException {
        if(f){
            wait();
        }
        n = i;
        System.out.println("Item Produced : "+n);
        notify();
        f = true;
    }

    synchronized public int consume_Item() throws InterruptedException{
        if(!f){
            wait();
        }
        System.out.println("Item Consumed : "+n);
        notify();
        f = false;
        return n;
    }
}
