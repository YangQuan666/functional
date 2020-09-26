package com.hikvision.stream.intermediate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlapMapTest {

    @Test
    void test() {
        Stream<String> lines = Stream.of("how are you", "i'm fine");
        // 传入一个mapper函数，指示如何将每个元素变成流
        Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" ")));
        words.forEach(System.out::println);
    }
}
