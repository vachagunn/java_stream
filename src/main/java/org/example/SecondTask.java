package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SecondTask {
    public static void main(String[] args) {
        Consumer<String> printResult = (result) -> System.out.println(result);

        List<String> names = List.of("java", "python", "java_ScrIpT", "java", "goLANg", "jav");
        names.stream()
                .distinct()
                .filter(x -> x.length() > 3)
                .map(x -> x.toLowerCase())
                .forEach(x -> printResult.accept(x));
    }
}
