package com.wuba.wsilk.sample.mapper;

import javax.annotation.*;

import com.wuba.wsilk.sample.User;


@Generated(value="com.wuba.wsilk.sample.mapper.UserMapper")
public class UserMapper{

    public static void copy(User src, User des){
            if(src != null && des != null) { 
            des.setId(src.getId());
            des.setUsername(src.getUsername());
            des.setPassword(src.getPassword());
            des.setCreateTime(src.getCreateTime());
            des.setBean(src.getBean());
            des.setBeanType(src.getBeanType());
            des.setRef(src.getRef());
            des.setMethod(src.getMethod());
            des.setCamelContext(src.getCamelContext());
            }
    }

}

