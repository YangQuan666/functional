package com.hikvision.function.type;

import org.junit.jupiter.api.Test;

public class FunctionalAnnotation {


    @FunctionalInterface
    interface User {
        void eat(String food);

    }

    interface Worker {
        void work(String job);
    }

//    @FunctionalInterface
//    interface Player {
//        String play(String game);
//        String hello(String arg);
//    }


    @Test
    void functional() {
        User user = food -> {};

        Worker worker =job -> {};

    }
}
