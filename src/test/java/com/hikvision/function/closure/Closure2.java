package com.hikvision.function.closure;

import java.util.function.IntSupplier;

public class Closure2 {

    // 等同 final 效果
    IntSupplier makeFun1(/*final*/ int x) {
        /*final*/ int i = 0;
        return () -> x + i;
    }

//    IntSupplier makeFun2(int x) {
//        int i = 0;
//        // x++ 和 i++ 都会报错：
//        return () -> x++ + i++;
//    }


}
