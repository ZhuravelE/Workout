package com.zhuravel.lambda.habr_stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationStream {

    public static void main(String[] args) {
        //Stream from collection
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();

        //Stream from values
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");

        //Stream from array
        String[] array = {"a1", "a2", "a3"};
        Stream<String> streamFromArray = Arrays.stream(array);

        //Stream from file
        try {
            Stream<String> streamFromFile = Files.lines(Paths.get("file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Stream from String
        IntStream streamFromString = "123".chars();
        System.out.print("StreamFromString = ");
        streamFromString.forEach(e -> System.out.print(e + ", "));
        System.out.println();

        //Stream with StreamBuilder
        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> streamFromBuilder = streamBuilder.add("a1").add("a2").add("a3").build();
        System.out.println("StreamFromBuilder = " + streamFromBuilder.collect(Collectors.toList()));

        //Parallel stream
        Stream<String> parallelStream = collection.parallelStream();

        //Endless stream with Stream.iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);
        System.out.println("StreamFromIterate = " + streamFromIterate.limit(5).collect(Collectors.toList()));

        //Endless stream with Stream.generate
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
        System.out.println("StreamFromGenerate = " + streamFromGenerate.limit(5).collect(Collectors.toList()));
    }
}
