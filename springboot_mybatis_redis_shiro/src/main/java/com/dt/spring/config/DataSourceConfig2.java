package com.dt.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DataSourceConfig2 {


	/**
	 * 配置数据源
	 * 
	 * @return
	 */
	@Bean(value="address2")
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:mysql://10.255.242.132:3306/FenxiaoPlatformDB?characterEncoding=utf-8");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("godgrant");
		dataSource.setInitialSize(5);
		dataSource.setMaxActive(5);
		return dataSource;
	}

//	@Bean
//	public ServletRegistrationBean statViewServlet() {
//		ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(
//				new StatViewServlet(), "/druid/*");
//		servletRegistrationBean.addInitParameter("allow", "192.168.50.132,127.0.0.1");
//		servletRegistrationBean.addInitParameter("deny", "192.168.50.131");
//		servletRegistrationBean.addInitParameter("loginUsername", "root");
//		servletRegistrationBean.addInitParameter("loginPassword", "root");
//		servletRegistrationBean.addInitParameter("reSetEnable", "false");
//		return servletRegistrationBean;
//	}
//
//	@Bean
//	public FilterRegistrationBean statFilter() {
//		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//		filterRegistrationBean.setFilter(new WebStatFilter());
//		filterRegistrationBean.addUrlPatterns("/*");
//		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,*.*,/druid/*");
//		return filterRegistrationBean;
//	}

}
