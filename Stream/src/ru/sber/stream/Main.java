package ru.sber.stream;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;
public class Main {
    private static final Random random = new Random();


    public static  void main(String[] args) {
        Map<String, List<StreamContainer>> streamContainer = Map.of(
                "bakugan", List.of(
                        new StreamContainer("helios", random.nextInt()),
                        new StreamContainer("hydranoid", random.nextInt()),
                        new StreamContainer("preyas", random.nextInt())
                ),
                "element", List.of(
                        new StreamContainer("pyrus", random.nextInt()),
                        new StreamContainer("darcus", random.nextInt()),
                        new StreamContainer("aquas", random.nextInt())
                )
        );
        Stream <StreamContainer> StreamContainers = streamContainer.values().stream().flatMap(List::stream);

        String binaryString = Stream.generate(() -> random.nextInt(0, 1)).limit(10).toString();
        Stream<Boolean> booleans = binaryString.chars().mapToObj(ch -> ch == '1');
        boolean result = booleans.reduce(true, (identity, value) -> identity & value);
    }
}
