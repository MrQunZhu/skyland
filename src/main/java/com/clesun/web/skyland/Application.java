package com.clesun.web.skyland;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.Properties;
@ServletComponentScan
@SpringBootApplication
@MapperScan("com.clesun.web.skyland.dao")
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Bean
	public PageHelper pageHelper(){
		PageHelper pageHelper = new PageHelper();
		//添加配置，也可以指定文件路径
		Properties p = new Properties();
		p.setProperty("offsetAsPageNum", "true");
		p.setProperty("rowBoundsWithCount", "true");
		p.setProperty("reasonable", "false");
		//配置mysql数据库的方言
		p.setProperty("dialect","mysql");
		pageHelper.setProperties(p);
		return pageHelper;
	}

	/*@Bean
	public ServletListenerRegistrationBean ServletListenerRegistrationBean(){
		ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
		servletListenerRegistrationBean.setListener(new WebContextListener());
		return servletListenerRegistrationBean;
	}*/
}
