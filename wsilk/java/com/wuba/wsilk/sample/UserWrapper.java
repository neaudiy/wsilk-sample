package com.wuba.wsilk.sample;

import javax.annotation.*;

import com.wuba.wsilk.sample.UserWrapper;


@Generated(value="com.wuba.wsilk.sample.UserWrapper")
public abstract class UserWrapper extends User{

    private User delegate;

    public UserWrapper(User delegate){
        this.delegate=delegate;
    }

    public User getDelegate(){
        return delegate;
    }

    public User getLastDelegate(){
        User result=this.delegate;
        while (result instanceof UserWrapper) {
         result=((UserWrapper) result).getDelegate();
        }
        return result;
    }

    public static User unwrap(User delegate){
        if (delegate instanceof UserWrapper) {
         return ((UserWrapper) delegate).getLastDelegate();
        }
        return delegate;
    }

    public String getId(){
        return  delegate.getId();
    }

    public void setId(String id){
         delegate.setId(id);
    }

    public void setUsername(String username){
         delegate.setUsername(username);
    }

    public void setPassword(String password){
         delegate.setPassword(password);
    }

    public java.util.Date getCreateTime(){
        return  delegate.getCreateTime();
    }

    public void setCreateTime(java.util.Date createTime){
         delegate.setCreateTime(createTime);
    }

}

