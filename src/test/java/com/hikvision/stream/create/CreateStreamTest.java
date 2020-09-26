package com.hikvision.stream.create;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamTest {

    // Stream.of()
    @Test
    void streamOfTest() {

        // int
        IntStream intStream = IntStream.of(1,2,3,4,5);
        intStream.forEach(System.out::println);

        // double
        DoubleStream doubleStream = DoubleStream.of(3.14159, 2.718, 1.618);
        doubleStream.forEach(System.out::println);

        // String
        Stream<String> stringStream = Stream.of("hello", "world");
        stringStream.forEach(System.out::println);

        // 对象
        Stream<User> userStream = Stream.of(new User("yang"), new User("quan"));
        userStream.forEach(System.out::println);

    }


    // 集合类转流
    @Test
    void collectionToStreamTest() {

        // List 转 Stream
        List<User> list = Arrays.asList(new User("yang"), new User("quan"));
        Stream<User> stream1 = list.stream();

        // Set 转 Stream
        Set<String> set = new HashSet<>(Arrays.asList("hello", "world"));
        Stream<String> stream2 = set.stream();

        // Map 转 Stream
        Map<String, Double> map = new HashMap<>();
        map.put("pi", 3.14159);
        map.put("e", 2.718);
        map.put("phi", 1.618);
        Stream<Map.Entry<String, Double>> stream4 = map.entrySet().stream();
    }

    // 生成整型范围流
    @Test
    void repeat() {
        IntStream.range(0, 9).forEach(i -> System.out.println("输出了：" + i));
    }

    // Stream.generate()
    @Test
    void generate() {
        Stream<String> stream1 = Stream.generate(() -> "hello");

        // 方法引用
        Stream<User> stream2 = Stream.generate(User::new);
    }


    int x = 1;

    // Stream.iterate(), 详情见方法注释
    @Test
    void iterate() {
        Stream<Integer> s = Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }
}
