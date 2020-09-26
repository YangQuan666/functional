package com.hikvision.function.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.IntFunction;

public class RecursionTest {

    // 必须是实例变量或静态变量
    /*static*/ IntFunction<Integer> fact;

    // 阶乘递归的lambda表达式
    @Test
    void recursionLambda() {

        fact = n -> n == 0 ? 1 : n * fact.apply(n - 1);

        for (int i = 0; i < 10; i++) {
            int value = fact.apply(i);
            System.out.printf("%d! is %d\n", i, value);

        }
    }
}
