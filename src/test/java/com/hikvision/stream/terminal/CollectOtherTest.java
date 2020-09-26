package com.hikvision.stream.terminal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: collect的其它常见操作
 * @author: yangquan6
 * @create: 2020-09-22 17:22
 */
public class CollectOtherTest {


    static Stream<String> stream;

    @BeforeAll
    static void iterate1() {
        String[] strings = new String[]{"Chrome", "Photoshop","Acrobat", "VSCode", "Firefox", "Visio", "IDEA"
                , "DataGrip", "Xshell", "Xmind", "Skype", "Clover", "Notion", "Postman", "Outlook", "Word"
                , "Excel", "PowerPoint","PostgreSQL"};
        stream = Arrays.stream(strings);
    }

    @Test
    void joinTest1() {
        String str = stream.collect(Collectors.joining(","));
        System.out.println(str);
    }

    @Test
    void joinTest2() {
        // 附带前缀和后缀的joining操作
        String str = stream.collect(Collectors.joining("|", "(", ")"));
        System.out.println(str);
    }

    @Test
    void groupByTest1() {
        // 根据指定的函数进行分组操作
        // 举例：将字符串按照长度进行分组
        Map<Integer, List<String>> map = stream.collect(Collectors.groupingBy(String::length));
        map.entrySet().forEach(System.out::println);
    }

    @Test
    void groupByTest2() {
        // 第一个函数指定如何生成分组后的Key
        // 第二个参数为下游收集齐Collector，表示对Value进行的其它收集操作
        // 举例：将字符串按照长度进行分组，并且分组合后结果去重排序
        stream.collect(Collectors.groupingBy(String::length,Collectors.toCollection(TreeSet::new)))
                .entrySet().forEach(System.out::println);
    }
}
