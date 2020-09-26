package com.hikvision.function.closure;

import org.junit.jupiter.api.Test;

import java.util.function.IntSupplier;

public class Closure1 {

    // 类成员变量
    private int i;

    @Test
    void test() {
        IntSupplier f1 = () -> i++;
        System.out.println(f1.getAsInt());
        System.out.println(f1.getAsInt());
        System.out.println(f1.getAsInt());
    }

}
