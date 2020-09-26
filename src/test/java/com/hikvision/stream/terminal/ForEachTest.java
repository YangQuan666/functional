package com.hikvision.stream.terminal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class ForEachTest {

    static List<String> list = new LinkedList<>();

    @BeforeAll
    static void setList() {
        // size * 10
        int size = 10000;
        for (int i = 0; i < size; i++) {
            list.add("str" + i);
        }
    }

    @Test
    void forTest() {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }

    @Test
    void forInTest() {
        for (String str : list) {
            System.out.println(str);
        }
    }

    @Test
    void forEachTest() {
        list.forEach(System.out::println);
    }
}
