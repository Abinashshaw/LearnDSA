package JavaConcepts;

public class ProducerConsumerMainThread {

    public static void main(String[] args) {
        Company c = new Company();
        Thread producer = new Producer(c);
        Thread consumer = new Consumer(c);

        producer.start();
        consumer.start();
    }


}
