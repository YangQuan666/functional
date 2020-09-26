package com.hikvision.stream.create;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

// 求一段连续范围的整数和
public class IntStreamTest {

    // 传统方法
    @Test
    void sum() {
        int result = 0;
        for (int i = 10; i < 20; i++)
            result += i;
        System.out.println(result);
    }

    // 使用流
    @Test
    void sum1() {
        int result = IntStream.range(10, 20).sum();
        System.out.println(result);
    }
}
