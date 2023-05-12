package com.wuba.wsilk.sample.single;

import javax.annotation.*;


@Generated(value="com.wuba.wsilk.sample.single.SingleEagerSingleton")
public class SingleEagerSingleton extends Single{

    private static final SingleEagerSingleton INSTANCE=new SingleEagerSingleton();

    private SingleEagerSingleton(){
    }

    public static SingleEagerSingleton getInstance(){
        return INSTANCE;
    }

}

