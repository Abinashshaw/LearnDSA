package ReferenceOperator;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        System.out.println("Hare Krishna learning Constructor Reference ");

        ProviderInter provider = () -> new Student();

        provider.getStudent().display();

        ProviderInter constructorProvider = Student::new;

        constructorProvider.getStudent().display();
    }
}
