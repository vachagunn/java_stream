package org.example;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printResult = (result) -> System.out.println(result);

        List<Integer> list = new Random()
                .ints(1000, 10, 10000)
                .mapToObj(x -> x)
                .toList();
        long listCount = list.stream().count();
        long listReduced = list.stream().reduce(0, (x, y) -> x + y);
        list.forEach(item -> printResult.accept(item.toString()));

    }
}