package com.hikvision.stream;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ExampleTest {

    // 如果不写注释，尝试理解代码含义
    @Test
    void randomNumber() {
        Random rand = new Random(47);
        SortedSet<Integer> sortedSet = new TreeSet<>();
        while (sortedSet.size() < 7) {
            int r = rand.nextInt(20);
            if (r < 5) {
                continue;
            }
            sortedSet.add(r);
        }
        System.out.println(sortedSet);
    }

    // 流式编程
    @Test
    void randomNumberStream() {
        new Random(47)
                .ints(5, 20)
                .limit(7)
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
}
