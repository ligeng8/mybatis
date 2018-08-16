package com.dt.spring.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {
    @Resource
	private DataSource dataSource;
}
