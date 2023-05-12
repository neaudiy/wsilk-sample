package com.wuba.wsilk.sample.builder;

import javax.annotation.*;

import com.wuba.wsilk.sample.User;


@Generated(value="com.wuba.wsilk.sample.builder.UserBuilder")
public class UserBuilder{

    private User user;

    private UserBuilder(){
        this.user=new User();
    }

    public static UserBuilder create(){
        UserBuilder userBuilder=new UserBuilder();
        return userBuilder;
    }

    public UserBuilder id(String id){
        this.user.setId(id);
        return this;
    }

    public UserBuilder username(String username){
        this.user.setUsername(username);
        return this;
    }

    public UserBuilder password(String password){
        this.user.setPassword(password);
        return this;
    }

    public UserBuilder createTime(java.util.Date createTime){
        this.user.setCreateTime(createTime);
        return this;
    }

    public UserBuilder bean(Object bean){
        this.user.setBean(bean);
        return this;
    }

    public UserBuilder beanType(Class<?> beanType){
        this.user.setBeanType(beanType);
        return this;
    }

    public UserBuilder ref(String ref){
        this.user.setRef(ref);
        return this;
    }

    public UserBuilder method(String method){
        this.user.setMethod(method);
        return this;
    }

    public UserBuilder camelContext(org.apache.camel.CamelContext camelContext){
        this.user.setCamelContext(camelContext);
        return this;
    }

}

