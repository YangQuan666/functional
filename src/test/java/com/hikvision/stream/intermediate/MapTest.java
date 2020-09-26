package com.hikvision.stream.intermediate;

import com.hikvision.stream.create.User;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class MapTest {

    Stream<User> stream = Stream.of(new User("yang"), new User("mario"), new User("jack"));

    @Test
    void mapTest() {
        stream.map(User::getName).forEach(System.out::println);
    }

    @Test
    void mapToIntTest() {
//        stream.map(user -> user.getName().length()).forEach(System.out::println);
        stream.mapToInt(user -> user.getName().length()).forEach(System.out::println);
    }

    @Test
    void mapToDoubleTest() {
        stream.mapToDouble(user -> user.getName().length() * Math.PI).forEach(System.out::println);
    }
}
