package LamdaExpression;

@FunctionalInterface
public interface SumInterface {

    // JVM automatically adds public abstract
    int sum(int a, int b);
}
