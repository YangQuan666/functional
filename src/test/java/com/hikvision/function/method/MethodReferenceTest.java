package com.hikvision.function.method;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

// 普通类
class User {

    String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
    // 静态方法
    static void play(String game) {
        System.out.println("在玩：" + game);
    }

    void eat(String food) {
        System.out.println("吃了：" + food);
    }

    void drink(String water) {
        System.out.println("喝了：" + water);
    }

    String sleep() {
        return "sleep good";
    }
}


public class MethodReferenceTest {


    @Test
    void test() {


        // 静态方法
        Consumer<String> consumer = User::play;

        // 普通方法必须先提供对象
        User user = new User();
        Consumer<String> consumer1 = user::eat;

        // 方法签名一致
        consumer1 = new User()::drink;

        // 方法签名不一致
//        consumer1 = user::sleep;

        // 构造方法引用,对于多态方法，编译器自动选择匹配
        Supplier<User> newUser = User::new;
    }
}
