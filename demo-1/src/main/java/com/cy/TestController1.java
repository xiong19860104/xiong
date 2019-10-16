package com.cy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:/properties/jdbc.properties")
@ConfigurationProperties(prefix= "jdbc")//这种前缀的方式一定要生成set方法
public class TestController1 {
	//@Value("${jdbc.jdbcUrl}")
	private String jdbcUrl;
	//@Value("${jdbc.username}")
	private String username;
	@RequestMapping("/test")
	public String getMsg() {
		return username+"hllo";
	}
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
