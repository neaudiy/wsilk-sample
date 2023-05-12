package com.wuba.wsilk.sample;

import javax.annotation.*;

import com.wuba.wsilk.sample.UserComposite;

import java.util.ArrayList;
import java.util.List;


@Generated(value="com.wuba.wsilk.sample.UserComposite")
public class UserComposite extends User{

    private final List<User> composite=new ArrayList<>();

    public UserComposite add(User t){
        this.composite.add(t);
        return this;
    }

    public UserComposite remove(User t){
        this.composite.remove(t);
        return this;
    }

    public User getChild(int index){
        if(index>=composite.size()){
         return this.composite.get(index);
        }else{
         return null;
        }
    }

    public String getId(){
        composite.forEach((e) -> {
         e.getId();
        });
        return super.getId();
    }

    public void setId(String id){
        composite.forEach((e) -> {
         e.setId(id);
        });
        super.setId(id);
    }

    public void setUsername(String username){
        composite.forEach((e) -> {
         e.setUsername(username);
        });
        super.setUsername(username);
    }

    public void setPassword(String password){
        composite.forEach((e) -> {
         e.setPassword(password);
        });
        super.setPassword(password);
    }

    public java.util.Date getCreateTime(){
        composite.forEach((e) -> {
         e.getCreateTime();
        });
        return super.getCreateTime();
    }

    public void setCreateTime(java.util.Date createTime){
        composite.forEach((e) -> {
         e.setCreateTime(createTime);
        });
        super.setCreateTime(createTime);
    }

}

