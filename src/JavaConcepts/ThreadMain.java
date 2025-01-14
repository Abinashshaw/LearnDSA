package JavaConcepts;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadType1 threadType1 = new ThreadType1();

        Thread type1 = new Thread(threadType1);
        Thread type2 = new ThreadType2();
        type1.start();
        type2.start();

    }
}
