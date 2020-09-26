package com.hikvision.stream.terminal;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @description: 测试reduce方法
 * @author: yangquan6
 * @create: 2020-09-21 12:12
 */
public class ReduceTest {

    Stream<String> stream = Stream.of("my", "name", "is", "yang", "quan");

    @Test
    void oneParam() {
        // 将流中的字符串拼接
        // 因为没有初始值，所以结果可能为空
        Optional<String> value = stream.reduce((result, element) -> result + element);
        value.ifPresent(System.out::println);
    }

    @Test
    void twoParam() {
        // 第一个参数sum是上次调用的结果，而第二个参数str是从流传递过来的值
        // 看方法注释
        String value = stream.reduce("whatever", (result, element) -> result + element);
        System.out.println(value);
    }

    @Test
    void threeParam() {
        // 求流中单词长度之和
        // 继续看方法注释
        Integer value = stream.reduce(0, // 初始值
                (result, element) -> result + element.length(), // 累加器
                (integer, integer2) -> integer + integer2);//这里表示如果在并行流的情况下，多个部分如何进行合并
        System.out.println(value);
    }
}
