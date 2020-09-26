package com.hikvision.stream.terminal;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: collect方法测试
 * @author: yangquan6
 * @create: 2020-09-21 21:40
 */
public class CollectTest {

    Stream<String> stream = Stream.of("java", "c++", "python", "swift", "rust");

    @Test
    void streamToList() {

        // Stream 转 List
        List<String> list = stream.collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    @Test
    void streamToSet() {
        // Stream 转 Set
        Set<String> set = stream.collect(Collectors.toSet());
        set.forEach(System.out::println);
    }

    @Test
    void streamToMap() {
        // Stream 转 Map
        Map<String, Integer> map = stream.collect(Collectors.toMap(s -> s, String::length)); // 如何生成 K,V
        map.entrySet().forEach(System.out::println);
    }

    @Test
    void streamToCollection() {
        // Stream 转 Collection
        LinkedList<String> linkedList = stream.collect(Collectors.toCollection(LinkedList::new));
        linkedList.forEach(System.out::println);
    }

}
