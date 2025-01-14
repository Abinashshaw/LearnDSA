package ReferenceOperator;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(5, 10, 20, 15);

        System.out.println(integerList);

        integerList.stream().forEach(e -> System.out.println(e));

        integerList.stream().forEach(System.out::println);
    }
}
