package com.hikvision.function.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExpressionsTest {

    @Test
    void lambdaExpressions() {

        Supplier<String> lambda0 = () -> "lambda-0";

        Function<String, String> lambda1 = s -> s + "无括号";

        Function<String, String> lambda2 = (s) -> s + "有括号";

        BiConsumer<String, Integer> lambda3 = (s, integer) -> s = s + integer;

        BiConsumer<String, Integer> lambda4 = (s, integer) -> {
            System.out.println(s);
            System.out.println(integer);
        };




    }
}
