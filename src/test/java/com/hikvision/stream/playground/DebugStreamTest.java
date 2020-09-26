package com.hikvision.stream.playground;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class DebugStreamTest {

    @Test
    void debug() {
        Stream<String> stream = Stream.of("Apple", "Amazon", "Alphabet", "Microsoft");
        stream.filter(s -> s.startsWith("A")).map(s -> {
            Map<String, Object> map = new HashMap<>();
            map.put("name", s);
            map.put("length", s.length());
            return map;
        }).forEach(System.out::println);
    }

    @Test
    void trace() {
        Stream<String> stream = Stream.of("Apple", "Amazon", "Alphabet", "Microsoft");
        stream.filter(s -> s.startsWith("A")).map(s -> {
            Map<String, Object> map = new HashMap<>();
            map.put("name", s);
            map.put("length", s.length());
            return map;
        }).forEach(
                stringObjectMap -> System.out.println(stringObjectMap.entrySet()));
    }
}
