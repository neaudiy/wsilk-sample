package com.wuba.wsilk.sample;

import java.util.Date;

import org.apache.camel.language.bean.BeanLanguage;

import com.wuba.wsilk.producer.builder.Builder;
import com.wuba.wsilk.producer.composite.Composite;
import com.wuba.wsilk.producer.jar.Jar;
import com.wuba.wsilk.producer.mapper.Mapper;
import com.wuba.wsilk.producer.wrapper.Wrapper;

@Composite 
@Builder
@Wrapper
@Mapper(User.class)
@Jar
public class User extends BeanLanguage {

	private String id;

	private String username;

	private String password;

	private Date createTime;  

	public String getId() {
		return id;
	}
    
	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username; 
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
