package ru.sber.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Stream.generate(() -> random.nextInt(10, 99))
                .limit(10).sorted().collect(Collectors.averagingInt(value -> value));

        Stream.Builder<String> builder = Stream.builder();
        Stream<String> string = builder.add("допустим").add("это").add("стринг").build();

        Stream<StreamContainer> Stream = string.map( str -> new StreamContainer(str, random.nextInt()));
        Map<Integer, String> map = Stream
                .collect(Collectors.toMap(container -> container.count, container -> container.name));
    }
}
