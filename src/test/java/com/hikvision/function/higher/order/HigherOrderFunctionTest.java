package com.hikvision.function.higher.order;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HigherOrderFunctionTest {


    @Test
    void producer() {
        // 生产者函数
        Function<String, Function<String, String>> function = s -> {
            System.out.println(s);
            return s1 -> s + s1;
        };

        System.out.println(function.apply("hello").apply(" world"));
    }

    @Test
    void consumer() {
        // 消费者函数
        Consumer<Consumer<String>> consumer = stringConsumer -> {
            stringConsumer.accept("hello");
            System.out.println("world");
        };

        consumer.accept(s -> {
            System.out.println(s);
        });

    }

    // 组合函数
    @Test
    void combination() {
        Consumer<String> consumer1 = System.out::println;
        // andThen
        Consumer<String> consumer2 = consumer1.andThen(System.out::println);
        consumer2.accept("hello");

        Predicate<String> predicate1 = s -> s.length() > 4;
        // and
        Predicate<String> predicate2 = predicate1.and(s -> s.startsWith("h"));
        System.out.println(predicate2.test("hello"));;
    }
}
