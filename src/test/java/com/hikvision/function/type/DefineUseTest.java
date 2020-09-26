package com.hikvision.function.type;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

class User {
    String name;

    public User() {
        this.name = "yang quan";
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class DefineUseTest {

    @Test
    void lambda() {
        // 函数的定义
        Consumer<String> consumer = s -> {
            String lowerCase = s.toLowerCase();
            System.out.println(lowerCase);
        };

        // 函数的调用
        consumer.accept("Null Pointer Exception");
    }

    @Test
    void refer() {
        User user = new User("java NO.1");
        // 函数的定义
        Supplier<String> supplier = user::getName;
        // 函数的调用
        String str = supplier.get();

        // 函数的定义
        Supplier<User> supplier1 = User::new;
        // 函数的调用
        User user1 = supplier1.get();
    }
}
