package com.hikvision.function;

import org.junit.jupiter.api.Test;


// 客户端
class Client {
    // 处理来自服务端的响应
    static void doResponse(String msg) {
        System.out.println("客户端接受到的消息为：" + msg);
    }
}

//模拟的回调接口
interface Callback {
    void handle(String msg);
}

// 服务器
class Server {
    // 处理来自客户端的请求
    static void doRequest(Callback callback) {
        // 做一些其他事情
        callback.handle("success");
        // 继续做一些其他事情
    }
}

public class MethodReferenceTest {

    @Test
    void test1() {

        Server.doRequest(new Callback() {
            @Override
            public void handle(String msg) {
                System.out.println("客户端接受到的消息为：" + msg);
            }
        });
    }


    // 方法引用
    @Test
    void test2() {
        // 将callback方法传递给服务器
        Server.doRequest(Client::doResponse);
    }
}
