package ReferenceOperator;

public class MethodRefDemo {
    public static void main(String[] args) {
        System.out.println("Hare Krishna, I am learning Reference Operator ");

        // implementation using lambda expression
        WorkInter workInter = () -> System.out.println("This is new method of doTask");

        workInter.doTask();

        WorkInter workInter1 = Stuffs::doStuffs;

        workInter1.doTask();

        Runnable runnable = Stuffs::threadTask;

        Thread thread1 = new Thread(runnable);

        thread1.start();

//        This will give error since we cannot use reference non-static method from ClassName
//        Runnable runnable1 = Stuffs::printNumber;

        Stuffs objectStuffs = new Stuffs();
        Runnable runnable1 = objectStuffs::printNumber;
//        note if we are providing method reference then we have to make sure that the
//        numbers of arguments in the method is same with the method we are providing
//        implementation in this case printNumber has zero arguments as run method
//        although the return type can be different ex return type of printNumber is int

        Runnable runnable2 = () -> objectStuffs.printNumber();

        new Thread(runnable1).start();

        new Thread(runnable2).start();

    }
}
