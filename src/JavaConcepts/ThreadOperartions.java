package JavaConcepts;

public class ThreadOperartions {
    public static void main(String[] args) {
        // get current running Thread
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println("Thread name "+name);
        thread.setName("MyMain");
        System.out.println("Thread name "+thread.getName());
        System.out.println("Thread Id "+thread.getId());
        System.out.println("Thread Priority "+thread.getPriority());
    }
}
