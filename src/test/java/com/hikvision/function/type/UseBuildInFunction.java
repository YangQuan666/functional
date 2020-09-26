package com.hikvision.function.type;

import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class UseBuildInFunction {

    @Test
    void use() {

        // 无参数，无返回值
        Runnable func1 = () -> {
            System.out.println("hello world");
        };

        // 无参数，返回值类型任意
        Supplier<String> func2 = () -> {
            return "hello world";
        };

        // 1参数，无返回值
        Consumer<String> func3 = s -> {
            System.out.println("hello world");
        };

        // 2参数，无返回值
        BiConsumer<String, Integer> func4 = (s, integer) -> {
            System.out.println(s);
            System.out.println(integer);
        };

        // 1参数，返回值任意
        Function<Integer, String> func5 = integer -> "hello world";

    }
}
