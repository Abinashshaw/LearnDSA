package LamdaExpression;

public class ThreadDemoUsingLambda {

    public static void main(String[] args) {

        Runnable thread1 = () -> {
          for (int i=1; i<=10; i++){
              System.out.println(i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Thread t1 = new Thread(thread1);
        t1.setName("Krishna");
        t1.start();

        Runnable t2 = () -> {
          for(int i=1; i<=10; i++){
              System.out.println("Multiplication of 2 : "+i*2);
              try {
                  Thread.sleep(2000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Thread t22 = new Thread(t2);
        t22.start();
    }
}
