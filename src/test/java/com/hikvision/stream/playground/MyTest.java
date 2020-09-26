package com.hikvision.stream.playground;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class MyTest {


    @Test
    void test() {

        IntStream.range(0, 10).forEach(System.out::println);
    }

}
