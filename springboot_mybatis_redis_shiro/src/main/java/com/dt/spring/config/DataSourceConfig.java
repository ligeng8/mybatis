package com.dt.spring.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
@PropertySource(ignoreResourceNotFound = true, value = "classpath:datasource.properties")
@ConfigurationProperties(prefix = "druid", ignoreUnknownFields = true, ignoreInvalidFields = true)
public class DataSourceConfig {

	private String url;
	private String DriverClass;
	private String username;
	private String password;
	private int initialSize;
	private int minIdle;
	private int maxActive;
	/**
	 * 配置数据源
	 * @return
	 */
	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(url);
		dataSource.setDriverClassName(DriverClass);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setInitialSize(initialSize);
		dataSource.setMaxActive(maxActive);
		return dataSource;
	}
	
	@Bean
	public ServletRegistrationBean statViewServlet() {
		ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
		servletRegistrationBean.addInitParameter("allow", "192.168.50.132,127.0.0.1");
		servletRegistrationBean.addInitParameter("deny", "192.168.50.131");
		servletRegistrationBean.addInitParameter("loginUsername", "root");
		servletRegistrationBean.addInitParameter("loginPassword", "root");
		servletRegistrationBean.addInitParameter("reSetEnable", "false");
		return servletRegistrationBean;
	}
	
	@Bean
	public FilterRegistrationBean statFilter() {
		FilterRegistrationBean filterRegistrationBean=	new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,*.*,/druid/*");
		return filterRegistrationBean;
	}
	
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriverClass() {
		return DriverClass;
	}
	public void setDriverClass(String driverClass) {
		DriverClass = driverClass;
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
	public int getInitialSize() {
		return initialSize;
	}
	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}
	public int getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}
	public int getMaxActive() {
		return maxActive;
	}
	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}
}
