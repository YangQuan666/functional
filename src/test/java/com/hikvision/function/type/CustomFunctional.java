package com.hikvision.function.type;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class CustomFunctional {

    // 接收三个参数并带有返回值
    @FunctionalInterface
    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }


    @Test
    void use() {
        // 定义
        TriFunction<Integer, Boolean, Double, String> triFunction = (integer, aBoolean, aDouble) -> "hello";

        // 调用
        String apply = triFunction.apply(1, true, 3.14);

    }
}
