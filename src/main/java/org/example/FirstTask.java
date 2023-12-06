package org.example;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstTask {
    public static void main(String[] args) {
        Consumer<String> printResult = (result) -> System.out.println(result);

        List<Integer> list = new Random()
                .ints(1000, 10, 10000)
                .mapToObj(x -> x)
                .toList();
        long listCount = list.stream().count();
        long listReduced = list.stream().reduce(0, (x, y) -> x + y);

        Map<Integer, Integer> map = list.stream()
            .distinct()
            .collect(Collectors.toMap(Function.identity(), i -> i + i));

        list.forEach(item -> printResult.accept(item.toString()));
        printResult.accept(String.valueOf(map));
    }
}