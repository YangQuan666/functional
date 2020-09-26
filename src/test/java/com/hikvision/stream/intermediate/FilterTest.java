package com.hikvision.stream.intermediate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterTest {

    Stream<String> stream = Arrays.stream(new String[]{"how", "are", "you", "i'm", "fine", "thank", "you", "and", "you"});

    @Test
    void filterTest() {
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
    }

    @Test
    void distinctTest() {
        stream.distinct().forEach(System.out::println);
    }
}
