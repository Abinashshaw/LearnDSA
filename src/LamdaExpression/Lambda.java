package LamdaExpression;

public class Lambda {

    public static void main(String[] args) {
        System.out.println("Hare Krishna Learning Lambda Expression ");

        // old way of using Functional Interface
        // here we need to create separate class and implement that Interface
        HelloFunctionalInterface hello = new HelloFunctionalInterfaceImpl();
        hello.sayHello();

        // anonymous class for implementing Functional Interface
        HelloFunctionalInterface hi = new HelloFunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from my anonymous class ");
            }
        };

        hi.sayHello();

        HelloFunctionalInterface hey = new HelloFunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from my second anonymous class ");
            }
        };

        hey.sayHello();

        HelloFunctionalInterface lambda = () -> System.out.println("Hare Krishna This is first Time I am using Lambda Expression ");

        lambda.sayHello();

        // Implementing SumInterface

        SumInterface sumAnonymous = new SumInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        System.out.println(sumAnonymous.sum(5, 10));

        SumInterface sum = (int a, int b) -> {
            return a+b;
        };

        System.out.println(sum.sum(8, 9));

        // First Rule of Lambda Expression says we can remove curly braces {} and return statement if there is only one line
        // Second Rule of Lambda Expression says we can remove even parameter type of argument

        SumInterface s1 = (int a, int b) ->  a+b;

        System.out.println(s1.sum(10, 18));

        SumInterface s2 = (a, b) -> a+b;

        System.out.println(s2.sum(7, 5));


        SumInterface s3 = (c, d) -> c+d;

        System.out.println(s3.sum(7, 5));

        // implementing Length Interface using lambda

//        LengthInterface len = (str) -> {
//            return  str.length();
//        };

//        LengthInterface len = (str ->  str.length());

         LengthInterface len = str ->  str.length();

        System.out.println("String Length : "+len.stringLength("Hare Krishna"));

;    }
}
