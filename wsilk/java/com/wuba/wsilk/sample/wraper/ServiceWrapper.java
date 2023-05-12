package com.wuba.wsilk.sample.wraper;

import javax.annotation.*;

import com.wuba.wsilk.sample.wraper.ServiceWrapper;


@Generated(value="com.wuba.wsilk.sample.wraper.ServiceWrapper")
public abstract class ServiceWrapper implements Service{

    private Service delegate;

    public ServiceWrapper(Service delegate){
        this.delegate=delegate;
    }

    public Service getDelegate(){
        return delegate;
    }

    public Service getLastDelegate(){
        Service result=this.delegate;
        while (result instanceof ServiceWrapper) {
         result=((ServiceWrapper) result).getDelegate();
        }
        return result;
    }

    public static Service unwrap(Service delegate){
        if (delegate instanceof ServiceWrapper) {
         return ((ServiceWrapper) delegate).getLastDelegate();
        }
        return delegate;
    }

    public void say(String name){
         delegate.say(name);
    }

}

