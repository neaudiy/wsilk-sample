package com.wuba.wsilk.sample.single;

import javax.annotation.*;


@Generated(value="com.wuba.wsilk.sample.single.SingleLazySingleton")
public class SingleLazySingleton extends Single{

    private SingleLazySingleton(){
    }

    public static SingleLazySingleton getInstance(){
        return InnerSingleton.INSTANCE;
    }

    private static class InnerSingleton{

        private static final SingleLazySingleton INSTANCE=new SingleLazySingleton();

    }

}

